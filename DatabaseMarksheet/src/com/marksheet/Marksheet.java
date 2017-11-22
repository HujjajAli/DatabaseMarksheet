package com.marksheet;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//import java.sql.SQLException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Marksheet implements ActionListener
{
	
	  
	
	   private int obtain;
	   private double percentage;
	   private String grade;
	   private boolean remarks;
	   private String name;
	   private String roll_No;
	   private String department;
	   private String fatherName;
	   
	   MarkConnection ob = new MarkConnection();
	   DBQueries q = new DBQueries();

	JFrame f = new JFrame();
	JLabel lblTitle = new JLabel();
	//Calculation calc = new Calculation();
	
	Font font = new Font("",1,20);
	
	
	JButton btnInsert = new JButton("SAVE");
	JButton btnCalculet = new JButton("Calculate");
	JButton btnUpdate = new JButton("UPDATE");
	JButton btnDelete = new JButton("DELETE");
	JButton btnNext = new JButton(">>>");
	JButton btnPerivois = new JButton("<<<");
	JButton btnOption = new JButton("Show Option's");
	//JButton updat2 = new JButton("UPDATE");
	//JButton cancel = new JButton("CANCEL");
	
	JButton btnSearch = new JButton("Show");
	
	JTextField searchField = new JTextField();
	JLabel lblSearch = new JLabel();
	
	JLabel lblName = new JLabel();
	JLabel lblFatherName = new JLabel();
	JLabel lblRoll_No  = new JLabel();
	JLabel lblDepartment = new JLabel();
	JLabel lblSub1 = new JLabel();
	JLabel lblSub2 = new JLabel();
	JLabel lblSub3 = new JLabel();
	
	
	JLabel DataName = new JLabel();
	JLabel DataFatherName = new JLabel();
	JLabel DataRollNo = new JLabel();
	JLabel DataDepartment = new JLabel();
	
	//JLabel DataSub1 = new JLabel();
	//JLabel DataSub2 = new JLabel();
	//JLabel DataSub3 = new JLabel();
	
	
	
	
	JLabel lblID = new JLabel();
	JLabel lblObtain = new JLabel();;
	JLabel lblTotal = new JLabel();;
	JLabel lblPercentage = new JLabel();;
	JLabel lblGrade = new JLabel();
	JLabel lblRemarks = new JLabel();
	
	
	//hide Labels//
	JLabel hideDataName = new JLabel();
	JLabel hideDataFatherName = new JLabel();
	JLabel hideDataRollNo = new JLabel();
	JLabel hideDataDepartment = new JLabel();
	JLabel hidelblID = new JLabel();
	JLabel hidelblObtain = new JLabel();;
	JLabel hidelblTotal = new JLabel();;
	JLabel hidelblPercentage = new JLabel();;
	JLabel hidelblGrade = new JLabel();
	JLabel hidelblRemarks = new JLabel();
	//hide LAbels//
	
	
	
	JTextField fieldName = new JTextField();
	JTextField fieldFatherName = new JTextField();
	JTextField fieldRoll_No = new JTextField();
	JTextField fieldDepartment = new JTextField();
	JTextField fieldSub1 = new JTextField();
	JTextField fieldSub2 = new JTextField();
	JTextField fieldSub3 = new JTextField();
	
	public Marksheet()
	{
		f.setSize(1130,600);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(lblTitle);
		f.add(lblName);
		f.add(lblFatherName);
		f.add(lblRoll_No);
		f.add(lblDepartment);
		f.add(lblSub1);
		f.add(lblSub2);
		f.add(lblSub3);
		
		f.add(fieldName);
		f.add(fieldFatherName);
		f.add(fieldRoll_No );
		f.add(fieldDepartment );
		f.add(fieldSub1 );
		f.add( fieldSub2 );
		f.add(fieldSub3 );
		
		f.add(lblID);
		f.add(DataName);
		f.add(DataFatherName );
		f.add(DataRollNo );
		f.add( DataDepartment );
		//f.add( DataSub1 );
		//f.add( DataSub2 );
		//f.add(DataSub3 );
		f.add( lblObtain);
		f.add( lblTotal);
		f.add( lblPercentage);
		f.add(lblGrade);
		f.add( lblRemarks);
		
		//hide Labels//
		
		f.add( this.hidelblID);
		f.add( this.hideDataName);
		f.add(this.hideDataFatherName);
		f.add( this.hideDataRollNo);
		f.add( this.hideDataDepartment);
		f.add( this.hidelblObtain);
		f.add( this.hidelblTotal);
		f.add( this.hidelblPercentage);
		f.add( this.hidelblGrade);
		f.add( this.hidelblRemarks);
		
		
		//hide Labels//
		
		f.add(btnInsert);
		
		lblTitle.setBounds(20, 20, 500, 25);
		lblTitle.setText("Marksheet....Programe");
		lblTitle.setFont(font);
		
		//lblID.setText("Student Name");
		//lblID.setBounds(30,50,100,20);
		
		lblName.setText("Student Name");
		lblName.setBounds(25,100,100,20);
		
		lblFatherName.setText("Father Name");
		lblFatherName.setBounds(25,150,100,20);
		
		lblRoll_No.setText("Roll N0");
		lblRoll_No.setBounds(25,200,100,20);
		
		lblDepartment.setText("I-T-C");
		lblDepartment.setBounds(25,250,100,20);
		
		lblSub1.setText("Java");
		lblSub1.setBounds(25,300,100,20);
		
		lblSub2.setText("PHP");
		lblSub2.setBounds(25,350,100,20);
		
		lblSub3.setText("HTML");
		lblSub3.setBounds(25,400,100,20);
		
		
		fieldName.setBounds(150, 100, 150, 20);
		fieldFatherName.setBounds(150, 150, 150, 20);
		fieldRoll_No.setBounds(150, 200, 150, 20);
	    fieldDepartment.setBounds(150, 250, 150, 20);
		
		fieldSub1.setBounds(150, 300, 150, 20);
		fieldSub2.setBounds(150, 350, 150, 20);
		fieldSub3.setBounds(150, 400, 150, 20);
		
		
		
		btnCalculet.setBounds(30,500,120,30);
		btnCalculet.addActionListener(this);
		
		f.add(btnCalculet);
		f.add(btnInsert);
		f.add(btnUpdate);
		f.add(btnDelete);
		f.add(btnNext);
		f.add(btnPerivois);
		f.add(btnSearch);
		f.add(btnOption);
		
		f.add(searchField);
		f.add(lblSearch);
		/*JButton  = new JButton("UPDATE");
		JButton  = new JButton("DELETE");
		JButton  = new JButton(">>>");
		JButton  = new JButton("<<<");
		
		JButton  = new JButton();
	
	JTextField  = new JTextField();
	JLabel lblSearch = new JLabel();
	JButton  = new JButton("Show Option's");
	*/
		
		/*btnInsert.setBounds(350,250,120,40);
		btnUpdate.setBounds(470, 250, 120, 40);
		btnDelete.setBounds(590, 250, 120, 40);
		btnNext.setBounds(520,290,120,40);
		btnPerivois.setBounds(400, 290, 120, 40);*/
		
		btnOption.setBounds(500,530,150,25);
		
		btnInsert.addActionListener(this);
		btnOption.addActionListener(this);
		btnDelete.addActionListener(this);
		btnNext.addActionListener(this);
		btnPerivois.addActionListener(this);
		
		searchField.setBounds(500,10,80,20);
		
		lblSearch.setText("Search by ID");
		lblSearch.setBounds(400,10, 200, 20);
		
		btnSearch.setBounds(600,10,70,25);
		btnSearch.addActionListener(this);
		
	    ///	showOutPut();
		//hideLabels();
	}
	
	public void hideLabels(int Id)
	{
		String data[] = q.searchData(Id); 
		
		lblID.setText("ID");
		hidelblID.setText(data[0]);
		lblID.setBounds(350, 50, 100, 20);
		hidelblID.setBounds(350, 100, 100, 20);
		
		DataName.setText("Student Name");
		DataName.setBounds(400, 50, 200, 20);
		hideDataName.setText(data[1]);
		hideDataName.setBounds(400, 100, 200, 20);
		
		
		DataFatherName.setText("Father Name");
		DataFatherName.setBounds(500, 50, 200, 20);
		hideDataFatherName.setText(data[2]);
		hideDataFatherName.setBounds(500, 100, 200, 20);
		
		DataRollNo.setText("Roll No");
		DataRollNo.setBounds(600, 50, 200, 20);
		hideDataRollNo.setText(data[3]);
		hideDataRollNo.setBounds(600, 100, 200, 20);
		
		DataDepartment.setText("Department");
		DataDepartment.setBounds(700, 50, 200, 20);
		hideDataDepartment.setText(data[4]);
		hideDataDepartment.setBounds(700, 100, 200, 20);
		
		lblTotal.setText("Total");
		lblTotal.setBounds(800, 50, 200, 20);
		hidelblTotal.setText(data[5]);
		hidelblTotal.setBounds(800, 100, 200, 20);
		
		lblObtain.setText("Obtain");
		lblObtain.setBounds(850, 50, 200, 20);
		hidelblObtain.setText(data[6]);
		hidelblObtain.setBounds(850, 100, 200, 20);
		
		lblPercentage.setText("Percentage");
		lblPercentage.setBounds(900, 50, 200, 20);
		hidelblPercentage.setText(data[7]);
		hidelblPercentage.setBounds(900, 100, 200, 20);
		
		lblGrade.setText("Grade");
		lblGrade.setBounds(1000, 50, 200, 20);
		hidelblGrade.setText(data[8]);
		hidelblGrade.setBounds(1000, 100, 200, 20);
		
		lblRemarks.setText("Remarks");
		lblRemarks.setBounds(1050, 50, 200, 20);
		hidelblRemarks.setText(data[9]);
		hidelblRemarks.setBounds(1050, 100, 200, 20);
		
		btnInsert.setBounds(350,250,120,40);
		btnUpdate.setBounds(470, 250, 120, 40);
		btnDelete.setBounds(590, 250, 120, 40);
		btnNext.setBounds(520,290,120,40);
		btnPerivois.setBounds(400, 290, 120, 40);
		//btnOption.setBounds(500,530,150,25);
		
	}
	
	public void showOutPut()
	{
		int java = Integer.parseInt(fieldSub1.getText());
		int php  = Integer.parseInt(fieldSub2.getText());
		int html = Integer.parseInt(fieldSub3.getText());
		
		
		this.obtain = (java+php+html);
		this.percentage = (obtain*100)/300;
		
		
		
		if(percentage>=40)
		{
			this.remarks = true;
		}else
		{
			this.remarks = false;
		}
		
		
		if(percentage>=90)
		{
			this.grade = "A1";
		}
		else if(percentage>=75)
		{
			this.grade = "A";
		}
		else if(percentage>=60)
		{
			this.grade = "B";
		}
		else if(percentage>=50)
		{
			this.grade = "C";
		}
		else if(percentage>=40)
		{
			this.grade = "D";
		}
		else
		{
			this.grade = "F";
		}
		
		
		
		
		
		//JTextField fieldSub1 = new JTextField();
		//JTextField fieldSub2 = new JTextField();
		//JTextField fieldSub3 = new JTextField();
		
		
		DataName.setText("Student Name:");
		DataName.setBounds(900, 100, 200, 20);
		hideDataName.setText(""+fieldName.getText());
		hideDataName.setBounds(1000, 100, 200, 20);
		DataName.setVisible(true);
		hideDataName.setVisible(true);
		
		
		DataFatherName.setText("Father Name");
		DataFatherName.setBounds(900, 150, 200, 20);
		hideDataFatherName.setText(""+fieldFatherName.getText());
		hideDataFatherName.setBounds(1000, 150, 200, 20);
		DataFatherName.setVisible(true);
		hideDataFatherName.setVisible(true);
		
		
		DataRollNo.setText("Roll No");
		DataRollNo.setBounds(900, 200, 200, 20);
		hideDataRollNo.setText(""+fieldRoll_No.getText());
		hideDataRollNo.setBounds(1000, 200, 200, 20);
		DataRollNo.setVisible(true);
		hideDataRollNo.setVisible(true);
		
		DataDepartment.setText("Department");
		DataDepartment.setBounds(900, 250, 200, 20);
		hideDataDepartment.setText(""+fieldDepartment.getText());
		hideDataDepartment.setBounds(1000, 250, 200, 20);
		DataDepartment.setVisible(true);
		hideDataDepartment.setVisible(true);
		
		lblTotal.setText("Total");
		lblTotal.setBounds(900, 300, 200, 20);
		hidelblTotal.setText("300");
		hidelblTotal.setBounds(1000, 300, 200, 20);
		hidelblTotal.setVisible(true);
		lblTotal.setVisible(true);
		
		lblObtain.setText("Obtain Marks");
		lblObtain.setBounds(900, 350, 200, 20);
		hidelblObtain.setText(""+obtain);
		hidelblObtain.setBounds(1000, 350, 200, 20);
		lblObtain.setVisible(true);
		hidelblObtain.setVisible(true);
		
		lblPercentage.setText("Percentage");
		lblPercentage.setBounds(900, 400, 200, 20);
		hidelblPercentage.setText(""+percentage);
		hidelblPercentage.setBounds(1000, 400, 200, 20);
		lblPercentage.setVisible(true);
		hidelblPercentage.setVisible(true);
		
		lblGrade.setText("Grade");
		lblGrade.setBounds(900, 450, 200, 20);
		hidelblGrade.setText(""+grade);
		hidelblGrade.setBounds(1000, 450, 200, 20);
		lblGrade.setVisible(true);
		hidelblGrade.setVisible(true);
		
		lblRemarks.setText("Remarks");
		lblRemarks.setBounds(900, 500, 200, 20);
		hidelblRemarks.setText(""+(remarks?"Pass":"Fail"));
		hidelblRemarks.setBounds(1000, 500, 200, 20);
		lblRemarks.setVisible(true);
		hidelblRemarks.setVisible(true);
		
		
	}
	
	public void updateForm()//Update Form Methode
	{
		JFrame f2 = new JFrame();
		Font f = new Font("",4,22);
		
		
		
		JLabel lblUpdateTitle = new JLabel();
		JLabel lblUpdateID = new JLabel();
		JLabel lblUpdateName = new JLabel(); 
		JLabel lblUpdateFatherName = new JLabel();
		JLabel lblUpdateRollNo = new JLabel();
		JLabel lblUpdateDepartment = new JLabel();
		JLabel lblUpdateObtain = new JLabel();
		JLabel lblUpdatePercentage = new JLabel();
		JLabel lblUpdateGrade = new JLabel();
		JLabel lblUpdateRemarks = new JLabel();
		
		
		JTextField updateIDField = new JTextField();
		JTextField updateNameField = new JTextField();
		JTextField updateFatherNameField = new JTextField();
		JTextField updateRollNoField = new JTextField();
		JTextField updateDepartmentField = new JTextField();
		JTextField updateObtainField = new JTextField();
		JTextField updatePercentageField = new JTextField();
		JTextField updateGradeField = new JTextField();
		JTextField updateRemarksField = new JTextField();
		
		
		f2.setSize(450,600);
		f2.setVisible(true);
		f2.setLayout(null);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f2.add(lblUpdateTitle);
		
		f2.add(lblUpdateID);
		f2.add(lblUpdateName);
		f2.add(lblUpdateFatherName);
		f2.add(lblUpdateRollNo);
		f2.add(lblUpdateDepartment);
		f2.add(lblUpdateObtain);
		f2.add(lblUpdatePercentage);
		f2.add(lblUpdateGrade);
		f2.add(lblUpdateRemarks);
		f2.add(updateIDField);
		f2.add(updateNameField);
		f2.add(updateFatherNameField);
		f2.add(updateRollNoField);
		f2.add(updateDepartmentField);
		f2.add(updateObtainField);
		f2.add(updatePercentageField);
		f2.add(updateGradeField);
		f2.add(updateRemarksField);
		
		lblUpdateTitle.setBounds(125,10,200,30);
		lblUpdateTitle.setFont(f);
		lblUpdateTitle.setText("Update Marksheet");
		
		lblUpdateID.setBounds(60,80,100,20);
		lblUpdateID.setText("ID");
		updateIDField.setBounds(160,80,50,20);
		updateIDField.setText(""+this.hidelblID);
		
		lblUpdateName.setBounds(60, 130, 100, 20);
		lblUpdateName.setText("Name");
		updateNameField.setBounds(160, 130, 150, 20);
		updateNameField.setText(""+this.hideDataName);
		
		
		lblUpdateFatherName.setBounds(60, 180, 100, 20);
		lblUpdateFatherName.setText("Father Name");
		updateFatherNameField.setBounds(160, 180, 150, 20);
		updateFatherNameField.setText(""+this.hideDataFatherName);
		
		lblUpdateRollNo.setBounds(60,230,100,20);
		lblUpdateRollNo.setText("Roll No");
		updateRollNoField.setBounds(160,230,150,20);
		updateRollNoField.setText(""+this.hideDataRollNo);
		
		lblUpdateDepartment.setBounds(60, 280, 100, 20);
		lblUpdateDepartment.setText("Department");
		updateDepartmentField.setBounds(160, 280, 150, 20);
		updateDepartmentField.setText(""+this.hideDataDepartment);
		
		lblUpdateObtain.setBounds(60, 330, 100, 20);
		lblUpdateObtain.setText("Obtain");
		updateObtainField.setBounds(160,330,150,20);
		updateObtainField.setText(""+this.hidelblObtain);
		
		lblUpdatePercentage.setBounds(60, 380, 150, 20);
		lblUpdatePercentage.setText("Percentage");
		updatePercentageField.setBounds(160,380,150,20);
		updatePercentageField.setText(""+this.hidelblPercentage);
		
		lblUpdateGrade.setBounds(60, 430, 100, 20);
		lblUpdateGrade.setText("Grade");
		updateGradeField.setBounds(160,430,150,20);
		updateGradeField.setText(""+this.hidelblGrade);
		
		lblUpdateRemarks.setBounds(60, 480, 100, 20);
		lblUpdateRemarks.setText("Remarks");
		updateRemarksField.setBounds(160, 480, 150, 20);
		updateRemarksField.setText(""+this.hidelblRemarks);
		
	    JButton update2 = new JButton("UPDATE");
		JButton cancel = new JButton("CANCEL");
		f2.add(update2);
		f2.add(cancel);
		
		update2.setBounds(50,540,100,20);
		cancel.setBounds(200, 540, 100, 20);
		
		update2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int sid = Integer.parseInt(updateIDField.getText());		
				String sName = updateNameField.getText();		
				String sFName = updateFatherNameField.getText();
				String sRNo =  updateRollNoField.getText();
				String sDepart = updateDepartmentField.getText();
				int sObt = Integer.parseInt(updateObtainField.getText());
				int total = 300;
				double sPer = Double.parseDouble(updatePercentageField.getText());
		        	
				String stuGrade = updateGradeField.getText();
				String sRM = updateRemarksField.getText();
				
				q.updateData(sid, sName, sFName, sRNo, sDepart, total, sObt, sPer, stuGrade, sRM);
			}
			
		});
		
		
		
	}//Update Form Methode 
	
	@Override
	public void actionPerformed(ActionEvent action) 
	{
		
		
	   if(action.getSource()==btnCalculet)
	   {
		   
		 showOutPut();
		
	   }
	   else if(action.getSource()==btnOption)
	   {
		   hideLabels(1);
	   }
	   else if(action.getSource()==this.btnInsert)//Insert Querry Button
	   {
	     String name              = fieldName.getText();
	     String fatherName        =  fieldFatherName.getText();
	     String roll_No           = fieldRoll_No.getText();
	     String department        = fieldDepartment.getText();
	     int total                = 300;
	     int obtainMarks          = obtain;
	     double sPercentage       = percentage;
	     String sGrade            = grade;
	     String sRemarks          = hidelblRemarks.getText();
	     
		 q.InsertData(name, fatherName, roll_No, department, total, obtainMarks, sPercentage, sGrade, sRemarks);
		 
	   }//Insert Querry Button
	   else if(action.getSource() == this.btnDelete)//Delete Button
	   {
		   int deleteID = Integer.parseInt(hidelblID.getText());
		   
		   q.deletData(deleteID);
	   }//Delete Button
	   else if(action.getSource() == btnUpdate)//
	   {
		   JOptionPane.showMessageDialog(null, "Update Button");  
	   }
	   else if(action.getSource() == btnSearch)//Search Button
	   {
		   int searchID = Integer.parseInt(searchField.getText());
		  
		   hideLabels(searchID);
		   
	   }//Search Button
	   else if(action.getSource() == btnNext)
	   {
		  // JOptionPane.showMessageDialog(null, "OK");
		   int trackID = Integer.parseInt(searchField.getText());
		   trackID++;
		   searchField.setText(""+trackID);
		   hideLabels(trackID);
		   if(trackID>q.fullRecord())
		   {
			   btnNext.setEnabled(false);
		   }
		   btnPerivois.setEnabled(true);
	   }
	   else if(action.getSource() == this.btnPerivois)
	   {
		   int trackID = Integer.parseInt(searchField.getText());
		   trackID--;
		   searchField.setText(""+trackID);
		   
		   if(trackID<=0)
		   {
			   btnPerivois.setEnabled(false);
		   }
		   
		   hideLabels(trackID);
		   btnNext.setEnabled(true);
	   }
	 
	}

	public static void main(String[] args) 
	{
	//	new Marksheet();
	Marksheet g = new Marksheet();
	}
	
	

	
	

}
