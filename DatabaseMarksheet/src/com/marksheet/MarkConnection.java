package com.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class MarkConnection
{
	Connection con;
	public Statement stm;
	
	public MarkConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		//JOptionPane.showMessageDialog(null, "DriverLoad Succesful");
		}catch(Exception e)
		{
			e.printStackTrace();
		JOptionPane.showMessageDialog(null, "DriverLoad Not Succesful!");
		}
		
		
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			stm = con.createStatement();
			
			//JOptionPane.showMessageDialog(null, "Connection  Succesful!");
		}catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Connection Not Succesful!");
		}
	}
}
