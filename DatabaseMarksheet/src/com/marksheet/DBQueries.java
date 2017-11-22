package com.marksheet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DBQueries 
{

	MarkConnection ob = new MarkConnection();
	
	public void InsertData(String name,String fatherName,String roll_No,String department,int total,int obtainMarks,double sPercentage,String sGrade,String sRemarks)
	{
String insertQuery = "insert into marksheet(StudentName, FatherName, Roll_No, Department, Obtain, Total, Percentage, Grade, Remarks)values('"+name+"','"+fatherName+"', '"+roll_No+"', '"+department+"','"+total+"','"+obtainMarks+"','"+sPercentage+"','"+sGrade+"','"+sRemarks+"')";
		try{
	         int row = ob.stm.executeUpdate(insertQuery);
	         if(row>0)
	         {
	        	 JOptionPane.showMessageDialog(null, "Succesfully Saved");
	         }
	         else{JOptionPane.showMessageDialog(null, "Failed to Save");}
	}
	
	catch(Exception e){}
	}
	
	public String[] searchData(int searchID)
	{
		String result[] = new String[10];
		   
		   ///
		   try 
			{
				
				String slectQuery = "SELECT * FROM marksheet where StudentID='"+searchID+"' ";
				ResultSet rs = ob.stm.executeQuery(slectQuery);
				
				if(rs.next())
				{
					String  ID = rs.getString("StudentID");
					String name = rs.getString("StudentName");
					String fatherName = rs.getString("FatherName");
					String roll_No = rs.getString("Roll_No");
					String department = rs.getString("Department");
					String total = rs.getString("Total");
					String sObtain = rs.getString("Obtain");
					String sPercentage = rs.getString("Percentage");
					String sGrade = rs.getString("Grade");
					String remarks = rs.getString("Remarks");
					
					result[0] = ID;//1
					result[1] = name;//2
					result[2] = fatherName;//3
					result[3] = roll_No;//4
					result[4] = department;//5
					result[5] = total;//6
					result[6] = sObtain;//8
					result[7] = sPercentage;
					result[8] = sGrade;//9
					result[9] = remarks;//10
					
					
					return result;
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ID #"+searchID+" Not Found");
					return null;
				}
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
				return null;
				
			}
		
		
	}
	
	public void deletData(int deleteID)
	{
		String deleteQuery = "DELETE FROM marksheet where StudentID='"+deleteID+"' ";
		
		try {
			int row = ob.stm.executeUpdate(deleteQuery);
			 if(row>0)
	         {
	        	 JOptionPane.showMessageDialog(null, "Succesfully Delete");
	         }
	         else{JOptionPane.showMessageDialog(null, "Failed to Delete");}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateData(int id,String name,String fatherName,String roll_No,String department,int total,int obtainMarks,double sPercentage,String sGrade,String sRemarks)
	{
		String updateQuery = "update marksheet set StudentName ='"+name+"',FatherName='"+fatherName+"',Roll_No='"+roll_No+"',Department='"+department+"',Total="+total+",Obtain="+obtainMarks+",Percentage="+sPercentage+",Grade='"+sGrade+"',Remarks='"+sRemarks+"' where StudentID="+id;
		
		try {
			int row = ob.stm.executeUpdate(updateQuery);
			if(row>0)
			{
				JOptionPane.showMessageDialog(null, "Succefully Update");
			}
			else{JOptionPane.showMessageDialog(null, "Failed to Update");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int fullRecord()
	{
		ArrayList al = new ArrayList();
		
		String slectQuery = "SELECT * FROM marksheet ";
		
		try {
			ResultSet rs = ob.stm.executeQuery(slectQuery);
			while(rs.next())
			{
			int ids = rs.getInt(1);
			al.add(ids);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return al.size();
		
		
	}
	
	//public static void main(String[] args)
	//{
		//DBQueries o = new DBQueries();
		//o.updateData(4, "hamza", "Khalid", "50", "LLm", 300, 220, 80.80, "A", "Pass");
	//}
	

}
