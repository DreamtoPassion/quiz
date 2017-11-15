import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.swing.table.*;
class LogIn  implements ActionListener
{
Frame f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
TextField t1,t2,t21,t22,t31;
TextField t[]=new TextField[50];
TextField t77[]=new TextField[50];
Button b1,b2,b31,b29,b61,b62;
Choice mc5;
String n3,w3;
int n4,w4;
Label l1,l2,l3,l4,l7,l18,L21,L22,L23,L41,L42,l8,l9,l10;

			// DataBase Variables
				String n1,n7,n10,w1,w7;
				int id,id1;




Panel panel=new Panel();
Panel panel1=new Panel();

	LogIn()
	{
	f=new Frame();
	f1=new Frame();
	f2=new Frame();
	f3=new Frame();
	f4=new Frame();
	f5=new Frame();
	f6=new Frame();
	f8=new Frame();
	f9=new Frame();
	f10=new Frame();
	t1=new TextField();
	t2=new TextField();
	
				Label l[]=new Label[15];
				Label l77[]=new Label[15];
				for(int i=1;i<10;i++)
				{
				t[i]=new TextField();
				}
				for(int i=1;i<15;i++)
				{
				l[i]=new Label();
				}
				for(int i=1;i<15;i++)
				{
				l77[i]=new Label();
				}
				
	l1=new Label("KOVIZ LOGIN");
	l2=new Label("User Id");
	l3=new Label("Password");
	l4=new Label(":::::   New To Koviz   :::::");
	b1=new Button("LogIn");
	b2=new Button("SignUp");
	t1.setBounds(190,110,150,20);
	t2.setBounds(190,150,150,20);
	b1.setBounds(230,190,50,20);
	b2.setBounds(205,310,50,20);
	l1.setBounds(140,60,300,20);
	l2.setBounds(100,110,80,20);
	l3.setBounds(100,150,80,20);
	l4.setBounds(120,280,250,20);
	f.setLayout(null);
		   try{
		  	 Font font = new Font("Serif", Font.BOLD, 25);
			 Font font1 = new Font("Serif", Font.BOLD, 15);
			 Font font2 = new Font("Serif", Font.BOLD, 15);
			 Font font3 = new Font("Serif", Font.BOLD, 20);
		         l1.setFont(font);
			 l2.setFont(font1);
			 l3.setFont(font2);
			 l4.setFont(font3);
		       }catch(Exception e){}

				//f.setContentPane(new JLabel(new ImageIcon("Masters.png")));
				
  	f.setBackground(Color.GRAY);

	f.add(t1);
	f.add(t2);
	f.add(b1);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f.setSize(470,450);
	f.setVisible(true);
	}
public void actionPerformed(ActionEvent d)
{

		if(d.getActionCommand()=="LogIn") 
		{

	try{
	
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    //if()
	    //{	
            Connection con1=DriverManager.getConnection("jdbc:odbc:Facdb","","");
	    Statement st1=con1.createStatement();
	    ResultSet rs2=st1.executeQuery("select * from Factab");
            	while(rs2.next())
	    	{
            	 n3=rs2.getString(4);
            	 n4=rs2.getInt(5);
            	}
	    //}
	   // else
	   // {
	    Connection con2=DriverManager.getConnection("jdbc:odbc:Studb","","");
            Statement st2=con2.createStatement();
	    ResultSet rs3=st2.executeQuery("select * from Stutab");
           			while(rs3.next())
				{
					w3=rs3.getString(4);
					w4=rs3.getInt(5);
					
				}

	    //}


	  
	    }catch(Exception e){}










		f.setVisible(true);
		String z=t1.getText();
		String zz1=t2.getText();
		int z1=Integer.parseInt(zz1);
		Label l1,l2,l3,l4,l5,l6;		
	
			if((z.equals(w3))&&(z1==w4))
			{	
		 	panel1.setBounds(10,20,100,500);    
        		panel1.setBackground(Color.gray);  
        		Button b1=new Button("Join Group");
	  		Button b3=new Button("(|)");
        		b1.setBounds(10,30,80,20);    
        		b1.setBackground(Color.green);   
        		Label b2=new Label("     Groups");  
			Label l=new Label("PROFILE"); 
			l1=new Label("Name    :");
			l2=new Label("Status   :");
			l3=new Label("College :"); 
			l4=new Label(w1); 
			l5=new Label("Student"); 
			l6=new Label(w7);
        		b2.setBounds(10,70,80,20); 
			l.setBounds(190,70,200,20); 
			l1.setBounds(150,220,80,20); 
			l2.setBounds(150,250,80,20); 
			l3.setBounds(150,280,80,20); 
			l4.setBounds(230,220,80,20); 
			l5.setBounds(230,250,80,20); 
			l6.setBounds(230,280,80,20);
	 		b3.setBounds(360,30,30,20); 
		        b2.setBackground(Color.pink);   
        		panel1.add(b1); panel1.add(b2);
			panel1.setLayout(null);  
			b1.addActionListener(this);
			b3.addActionListener(this);		
	




				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
				   Font font1 = new Font("Serif", Font.BOLD, 18);
		        	   l.setFont(font);
					l1.setFont(font1);
					l2.setFont(font1);
					l3.setFont(font1);
				   }catch(Exception e){}



			ImageIcon icon2= new ImageIcon("Screenshot_81.png");
               		JLabel e1 = new JLabel( icon2, JLabel.CENTER);
			e1.setBounds(200,100,100,100);
			f5.add(e1);


        f5.add(panel1);  
	f5.add(l);
	f5.add(l1);
	f5.add(l2);
	f5.add(l3);
	f5.add(l4);
	f5.add(l5);
	f5.add(l6);
	f5.add(b3);
        f5.setSize(400,400);    
        f5.setLayout(null);    
        f5.setVisible(true);    

					
			
			/*if((mc.getItem(mc.getSelectedIndex())).equals("LogOut"))
			{
			f5.setVisible(false);
			f.setVisible(true);
			}*/		





		}	
				else if((z.equals(n3))&&(z1==n4))
				{
				Frame f3= new Frame("Profile");    
          			panel.setBounds(10,20,100,500);    
        			panel.setBackground(Color.gray);  
	  			Button b4=new Button("(|)");
				b4.setBounds(360,30,30,20);
        			Button b1=new Button("Create Group");     
        			b1.setBounds(10,30,80,20);    
       			        b1.setBackground(Color.green);   
        			Label b2=new Label("     Groups");  
				Label l=new Label("PROFILE"); 
				l1=new Label("Name    :");
				l2=new Label("Status   :");
				l3=new Label("College :");  
        			b2.setBounds(10,70,80,20); 
				l.setBounds(190,60,200,20); 
				l1.setBounds(150,220,80,20); 
				l2.setBounds(150,250,80,20); 
				l3.setBounds(150,280,80,20);
				l8=new Label(n1); 
				l9=new Label(n10); 
				l10=new Label(n7);
        			l8.setBounds(230,220,80,20); 
				l9.setBounds(230,250,80,20); 
				l10.setBounds(230,280,80,20); 
			        b2.setBackground(Color.pink);   
        			panel.add(b1); panel.add(b2);
				panel.setLayout(null);  
				b4.addActionListener(this);
				b1.addActionListener(this);
	
				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
				   Font font1 = new Font("Serif", Font.BOLD, 18);
		        	   l.setFont(font);
					l1.setFont(font1);
					l2.setFont(font1);
					l3.setFont(font1);
				   }catch(Exception e){}



			ImageIcon icon2= new ImageIcon("123.png");
               		JLabel e1 = new JLabel( icon2, JLabel.CENTER);
			e1.setBounds(200,100,100,100);
			f3.add(e1);


        f3.add(panel);  
	f3.add(l);
	f3.add(l1);
	f3.add(l2);
	f3.add(l3);
	f3.add(l8);
	f3.add(l9);
	f3.add(l10);
	f3.add(b4);
        f3.setSize(400,400);    
        f3.setLayout(null);    
        f3.setVisible(true);    
        
					
					
				}	

			else 
			{
			f.setVisible(true);
			try{
			   l7=new Label("Entered user name or password wrong");
			   l7.setForeground(Color.red);
			   l7.setBounds(100,230,400,20);
			   Font font = new Font("Serif", Font.BOLD, 20);
		   	   l7.setFont(font);
				  
		           }catch(Exception e){}
			   f.add(l7);			
			}
			


		}
	else if(d.getActionCommand()=="SignUp")
	{
		f.setVisible(false);
		Button b,b11,b2;
	  	f1.setLayout(null);
		b=new Button("Faculty");		
	 	b11=new Button("Student");	
    		b2=new Button("Back");	
ss		b.setBounds(140,240,80,20);
		b11.setBounds(270,240,80,20);

		b2.setBounds(50,50,40,20);
 		ImageIcon icon = new ImageIcon("123.png");
                JLabel b1 = new JLabel( icon, JLabel.CENTER);
		b1.setBounds(115,120,120,120);
		f1.add(b1);


		ImageIcon icon2= new ImageIcon("Screenshot_81.png");
                JLabel e1 = new JLabel( icon2, JLabel.CENTER);
		e1.setBounds(265,120,100,100);
		f1.add(e1);

		f1.setVisible(true);
		f1.setSize(500,500);
		f1.add(b);
		f1.add(b11);
		f1.add(b2);

		b.addActionListener(this);
		b11.addActionListener(this);
		b2.addActionListener(this);
				



	}


		else if(d.getActionCommand()=="(|)")
		{
		f5.setVisible(false);
		f.setVisible(true);
		t1.setText("");
		t2.setText("");
		l7.setText("");
		}





		
	else if(d.getActionCommand()=="Done")
	{
		f.setVisible(true);
		f1.setVisible(false);
		f2.setVisible(false);
		f4.setVisible(false);
		try {
        	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            	    Connection con=DriverManager.getConnection("jdbc:odbc:Facdb","","");
                    Statement st=con.createStatement();
       		    ResultSet rs=st.executeQuery("select * from Factab");
		    
           	   /* while(rs.next())
		    {
		    id=rs.getInt(1);
                    /*String n1=rs.getString(2);
		    String n2=rs.getString(3);
		    n3=rs.getString(4);
		    n4=rs.getInt(5);
		    int n5=rs.getInt(6);
		    int n6=rs.getInt(7);
		    String n7=rs.getString(8);
		    String n9=rs.getString(9);
		    String n10=rs.getString(10);
		    //String n11=rs.getString(11);*/
		    id=id+1;
	            //System.out.println(id);
		
		    }*/

		
 	        String k2=t[1].getText();
		String k3=t[2].getText();	
		String k4=t[3].getText();	
		String kk5=t[4].getText();
		int k5=Integer.parseInt(kk5);
		String kk6=t[5].getText();
		int k6=Integer.parseInt(kk6);
		String kk7=t[6].getText();					
		int k7=Integer.parseInt(kk7);
		String k8=t[7].getText();	
		String k9=t[8].getText();
		String k10=t[9].getText();
		//String k11=t[10].getText();
		//String k12=t[11].getText();


           
                String query="insert into Factab values(1,'"+k2+"','"+k3+"','"+k4+"',"+k5+","+k6+","+k7+",'"+k8+"','"+k9+"','"+k10+"')";
		int k=st.executeUpdate(query);
		//id=id+1;
	        st.close();
	        con.close();

               } catch (Exception ex) {System.out.println(ex);}


			t1.setText("");
			t2.setText("");
			l7.setText("");

       	}

			else if(d.getActionCommand()=="Back")
			{

			f.setVisible(true);
			f1.setVisible(false);
			t1.setText("");
			t2.setText("");
			l7.setText("");
			}

       				else if(d.getActionCommand()=="Faculty")
				{
				f1.setVisible(false);
				Button b1;
				Label l[]=new Label[15];
				for(int i=1;i<12;i++)
				{
				t[i]=new TextField();
				}
				for(int i=1;i<15;i++)
				{
				l[i]=new Label();
				}
			l[1]=new Label("FACULTY PROFILE");
			l[2]=new Label("First Name");
			l[3]=new Label("Last Name");
			l[4]=new Label("User Name");
			l[5]=new Label("Password");
			l[6]=new Label("Re-Enter Password");
			l[7]=new Label("Mobile Number");
			l[8]=new Label("College Name");
			l[9]=new Label("Branch");
			l[10]=new Label("Profession");
	
			b1=new Button("Done");
			t[1].setBounds(250,100,200,20);
			t[2].setBounds(250,140,200,20);
			t[3].setBounds(250,180,200,20);
			t[4].setBounds(250,220,200,20);
			t[5].setBounds(250,260,200,20);
			t[6].setBounds(300,300,150,20);
			t[7].setBounds(250,340,200,20);
			t[8].setBounds(250,380,200,20);
			t[9].setBounds(250,420,200,20);
			l[1].setBounds(165,40,300,20);
			l[2].setBounds(100,100,100,20);
			l[3].setBounds(100,140,100,20);
			l[4].setBounds(100,180,100,20);
			l[5].setBounds(100,220,150,20);
			l[6].setBounds(100,260,120,20);
			l[7].setBounds(100,300,100,20);
			l[8].setBounds(100,340,100,20);
			l[9].setBounds(100,380,100,20);
			l[10].setBounds(100,420,100,20);
			b1.setBounds(250,460,50,20);
			f2.setLayout(null);
		for(int i=1;i<12;i++)
		{
		f2.add(t[i]);
		}
		for(int i=1;i<15;i++)
		{
		f2.add(l[i]);
		}
		f2.add(b1);

			try{
			   Font font = new Font("Serif", Font.BOLD, 25);
			   l[1].setFont(font);
			   }catch(Exception e){}

				   
					Choice mc=new Choice();
     					 mc.add("91+");
     					 mc.add("81+");
      					 mc.add("22+");
      					 mc.add("38+");
      					 mc.setBounds(250,300,50,20);
					 f2.add(mc);

				        /* mc5 = new Choice();
					   mc5.add("Managing Director & Professor");
     					   mc5.add("Professional Commun Teacher");
      					   mc5.add("Professor");
      					   mc5.add("Assistant Professor");
					   mc5.add("Teacher");
					   mc5.add("Lecturer");
				           mc5.setBounds(250,420,200,20);
				           f2.add(mc5);*/

					 
	      	b1.addActionListener(this);
		f2.setSize(500,500);
		f2.setVisible(true);

		//Button b5=new Button("Back");
		//b5.setBounds(200,420,50,20);
		//f2.add(b5);
		//b5.addActionListener(this);
		
		}



				else if(d.getActionCommand()=="Student")
				{
				f1.setVisible(false);
				Button b1;
				Label l77[]=new Label[15];
				for(int i=1;i<12;i++)
				{
				t77[i]=new TextField();
				}
				for(int i=1;i<15;i++)
				{
				l77[i]=new Label();
				}

			l77[1]=new Label("STUDENT PROFILE");
			l77[2]=new Label("First Name");
			l77[3]=new Label("Last Name");
			l77[4]=new Label("User ID");
			l77[5]=new Label("Password");
			l77[6]=new Label("Re-Enter Password");
			l77[7]=new Label("Mobile Number");
			l77[8]=new Label("College Name");
			l77[9]=new Label("Branch");
			l77[10]=new Label("Student");
	
			b1=new Button("Register");
			t77[1].setBounds(250,100,200,20);
			t77[2].setBounds(250,140,200,20);
			t77[3].setBounds(250,180,200,20);
			t77[4].setBounds(250,220,200,20);
			t77[5].setBounds(250,260,200,20);
			t77[6].setBounds(300,300,150,20);
			t77[7].setBounds(250,340,200,20);
			t77[8].setBounds(250,380,200,20);
			//t[9].setBounds(250,260,40,20);
			l77[1].setBounds(165,40,300,20);
			l77[2].setBounds(100,100,100,20);
			l77[3].setBounds(100,140,100,20);
			l77[4].setBounds(100,180,100,20);
			l77[5].setBounds(100,220,150,20);
			l77[6].setBounds(100,260,120,20);
			l77[7].setBounds(100,300,100,20);
			l77[8].setBounds(100,340,100,20);
			l77[9].setBounds(100,380,100,20);
			b1.setBounds(250,420,50,20);
			f4.setLayout(null);
		for(int i=1;i<12;i++)
		{
		f4.add(t77[i]);
		}
		for(int i=1;i<15;i++)
		{
		f4.add(l77[i]);
		}
		f4.add(b1);

			try{
			   Font font = new Font("Serif", Font.BOLD, 25);
			   l77[1].setFont(font);
			   }catch(Exception e){}

  				         Choice mc = new Choice();
     					 mc.add("91+");
     					 mc.add("81+");
      					 mc.add("22+");
      					 mc.add("38+");
   					 mc.setBounds(250,300,50,20);
					 f4.add(mc);

					 
	        b1.addActionListener(this);
		f4.setSize(500,500);
		f4.setVisible(true);

		
		}






			else if(d.getActionCommand()=="Register")
			{
			
			f.setVisible(true);
			f1.setVisible(false);
			f2.setVisible(false);
			f4.setVisible(false);

	
			   try {
            			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           		        Connection con=DriverManager.getConnection("jdbc:odbc:Studb","","");
		                Statement st=con.createStatement();
				ResultSet rs1=st.executeQuery("select * from Stutab");
			
           		/*while(rs1.next())
			 {
			 id1=rs1.getInt(1);		
			 id1=id1+1;
			 String w1=rs1.getString(2);
		    	 String w2=rs1.getString(3);
		 	 w3=rs1.getString(4);
			 w4=rs1.getInt(5);
			 int w5=rs1.getInt(6);
			 int w6=rs1.getInt(7);
			 String w7=rs1.getString(8);
			 String w8=rs1.getString(9);
			 //String w9=rs1.getString(10);
			 //System.out.println(w1);

			 }*/
		
		
		String kk2=t77[1].getText();
		String kk3=t77[2].getText();	
		String kk4=t77[3].getText();	
		String kkk5=t77[4].getText();
		int  kk5=Integer.parseInt(kkk5);
		String kkk6=t77[5].getText();
		int  kk6=Integer.parseInt(kkk6);
		String kkk7=t77[6].getText();
		int  kk7=Integer.parseInt(kkk7);
		String kk8=t77[7].getText();	
		String kk9=t77[8].getText();
		//String kk10=t[9].getText();
		//String kk11=t[10].getText();
		//String kk12=t[11].getText();


           
            String query="insert into Stutab values(1,'"+kk2+"','"+kk3+"','"+kk4+"',"+kk5+","+kk6+","+kk7+",'"+kk8+"','"+kk9+"')";
       	    int k=st.executeUpdate(query);
	    st.close();
	    con.close();

        			} catch (Exception ex) {System.out.println(ex);}
	
			t1.setText("");
			t2.setText("");
			l7.setText("");
			
					
			}




		
			else if(d.getActionCommand()=="Create Group")
			{
			
	 		b29=new Button("CreateGroup");
			t21=new TextField(100);
			t22=new TextField(100);
			L21=new Label("Enter Group Name");
			L22=new Label("Enter Group ID");
			L23=new Label("Create a Group" );
			f8.setLayout(null);
			b29.setBounds(170,190,100,20);
			t21.setBounds(240,100,100,20);
			t22.setBounds(240,140,100,20);
			L21.setBounds(80,100,150,20);
			L22.setBounds(80,140,150,20);
			L23.setBounds(120,50,300,30);
				try{
		   		    Font font = new Font("Serif", Font.BOLD, 25);
		   		    L23.setFont(font);
		   	           }catch(Exception e){}
		
			try{
			    Font font = new Font("Serif", Font.BOLD, 15);
			    L21.setFont(font);
		   	    L22.setFont(font);
			   }catch(Exception e){}


	f8.add(t21);
	f8.add(t22);
	f8.add(L21);
	f8.add(L22);
	f8.add(L23);
	f8.add(b29);
	b29.addActionListener(this);
	f8.setSize(400,300);
	f8.setVisible(true);

			t1.setText("");
			t2.setText("");
			l7.setText("");
			

  		}

			else if(d.getActionCommand()=="Join Group")
			{
			
			b31=new Button("JoinGroup");
			t31=new TextField(100);
			L41=new Label("Join a Group" );
			L42=new Label("Enter Group ID");
			f9.setLayout(null);
			b31.setBounds(170,190,100,20);
			t31.setBounds(220,140,150,20);
			L41.setBounds(135,80,150,30);
			L42.setBounds(80,140,150,20);
	
				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
		   		   L41.setFont(font);
		   		   }catch(Exception e){}
		
				try{
		   		    Font font = new Font("Serif", Font.BOLD, 15);
		      		    L42.setFont(font);
	           		   }catch(Exception e){}

			b31.addActionListener(this);
			f9.add(t31);
			f9.add(L41);
			f9.add(L42);
			f9.add(b31);
			f9.setSize(400,300);
			f9.setVisible(true);	
		}






			else if(d.getActionCommand()=="CreateGroup")
			{
		
			String sp=t21.getText();
			Button b07=new Button(sp);
			b07.setBounds(10,100,80,20); 
			b07.setBackground(Color.yellow); 
			b07.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){l18=new Label("Create a new Post");
			f10= new Frame("Creating a new Post");
			b61=new Button("Back");
			b62=new Button("Next"); 
			CheckboxGroup cb = new CheckboxGroup(); 
        		Checkbox checkbox1 = new Checkbox("Match The Following",cb,true);  
        		checkbox1.setBounds(100,100,150,50);  
        		Checkbox checkbox2 = new Checkbox("Blanks",cb,false);  
        		checkbox2.setBounds(100,140,150,50);  
			Checkbox checkbox3 = new Checkbox("Choose The Correct Answer",cb,false);  
        		checkbox3.setBounds(100,180,200,50); 
			b61.setBounds(120,260,50,20);
			b62.setBounds(170,260,50,20);
			l18.setBounds(80,50,250,50) ;
		 		try{
		   		    Font font = new Font("Serif", Font.BOLD, 30);
		   		    l18.setFont(font);
		   		   }catch(Exception e){System.out.println("yolo");}
       		 f10.add(checkbox1);  
       		 f10.add(checkbox2); 
		 f10.add(checkbox3); 
		 f10.add(l18); 
	 	 //f10.add(b61); 
		 //f10.add(b62); 
        	 f10.setSize(400,400);  
        	 f10.setLayout(null);  
        	 f10.setVisible(true);  
		 }});
			
       			 panel.add(b07); 
		 	 t1.setText("");
			 t2.setText("");
			 l7.setText("");
			 f8.setVisible(false);
			
  		}

			
			else if(d.getActionCommand()=="JoinGroup")
			{
			f9.setVisible(false);
			String pq=t21.getText();
			String zr=t22.getText();
			int az=Integer.parseInt(zr);
			String zr1=t31.getText();
			int at=Integer.parseInt(zr1);
			System.out.println(az);
			System.out.println(pq);
				if(az==at)
				{
				Button b007=new Button(pq);
				b007.setBounds(10,100,80,20);
				System.out.println(az);
				System.out.println(at);
				b007.setBackground(Color.yellow);
				panel1.add(b007);	
				b007.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){l18=new Label("Create a new Post");
       				f10= new Frame("Creating a new Post");
				b61=new Button("Back");
				b62=new Button("Next"); 
				CheckboxGroup cb = new CheckboxGroup(); 
        			Checkbox checkbox1 = new Checkbox("Match The Following",cb,true);  
        			checkbox1.setBounds(100,100,150,50);  
        			Checkbox checkbox2 = new Checkbox("Blanks",cb,false);  
        			checkbox2.setBounds(100,140,150,50);  
				Checkbox checkbox3 = new Checkbox("Choose The Correct Answer",cb,false);  
        			checkbox3.setBounds(100,180,200,50); 
				b61.setBounds(120,260,50,20);
			 	b62.setBounds(170,260,50,20);
				l18.setBounds(80,50,250,50) ;
		    try{
		   	Font font = new Font("Serif", Font.BOLD, 30);
		   	l18.setFont(font);
		       }catch(Exception e){System.out.println("yolo");}
        f10.add(checkbox1);  
        f10.add(checkbox2); 
	f10.add(checkbox3); 
	f10.add(l18); 
	//f10.add(b61); 
	//f10.add(b62); 
        f10.setSize(400,400);  
        f10.setLayout(null);  
        f10.setVisible(true);  
		}});
			}
				else
				   {	
				   f9.setVisible(true);
				   Label lk=new Label("Enter Valid Group ID");
				   lk.setBounds(120,210,150,20);
				   f9.add(lk);
			    	   }

			
		}
		



	}
	

	 	public void itemStateChanged(ItemEvent e) 
		{
		}
	

	public static void main(String f[])
	{
	LogIn j=new LogIn();
	}

}