import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class blanks implements ActionListener,AdjustmentListener
{
	Frame f,f1,f2,f3,f4;
	Button b1,b2,b3,b4,b5;
	TextField t[],t1[],t2[];
	Label L[],L1[],L2[],L3[],L4[],l7,l5,l6;
	int count,mark;
	JScrollBar jsp;
		blanks()
		{
			try{
				f=new Frame();
				f1=new Frame();
				f3=new Frame();
				f4=new Frame();
				
				b2=new Button("OK");
				b1=new Button("Conduct");
				b3=new Button("Submit");
				b4=new Button("Show Results");
				b5=new Button("Back");
				t=new TextField[50];
				L=new Label[50];
				t1=new TextField[50];
				L1=new Label[50];
				t2=new TextField[50];
				L2=new Label[50];
				L3=new Label[50];
				L4=new Label[50];
				l7=new Label();
				
				
	 			jsp=new JScrollBar(JScrollBar.VERTICAL,30,40,0,300);  
				jsp.addAdjustmentListener(this);
				L[0]=new Label();
		
        			L[0].setText("ENTER NUMBER OF BLANKS ");
				Font font = new Font("Serif", Font.ITALIC, 20);
		        	L[0].setFont(font); 

	/*Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	L[1].setText(""+a); */
	
				L[0].setBounds(50,120,260,20);
				t[0]=new TextField(100);
				t[0].setBounds(320,120,30,20);


				f.setLayout(null);
				f1.setLayout(null);
				b2.setBounds(330,160,40,20);
				f.add(L[0]);
				f.add(t[0]);
	
				f.add(jsp,BorderLayout.EAST);
				f.add(b2);
				f.setTitle("Koviz");
			
				f.setBackground(Color.CYAN);
				f1.setBackground(Color.CYAN);
				b2.addActionListener(this);
				f.setSize(500,400);
				f.setVisible(true);
				}catch(NullPointerException e){}
		}


	public void actionPerformed(ActionEvent u)
	{
		//String rr=u.getActionCommand();
		//System.out.print(rr);
				
				if(u.getActionCommand()=="OK")
				{
								/*int nu= Integer.parseInt(t[0].getText());
				if(nu==0)
				{
				 l5=new Label("Enter some number!!!!!");
				 f.setLayout(null);
				 f.setBounds(100,120,200,30);
				 Font font1 = new Font("Serif", Font.BOLD, 25);
		        	 l5.setFont(font1); 
				 f.add(l5);	
				}*/


				f.setVisible(false);
				f2=new Frame();
				f2.setVisible(true);
				f2.setSize(750,600);
				f2.setBackground(Color.CYAN);
				f2.setLayout(null);
				l5=new Label("Enter Questions To Conduct Test");
				l5.setBounds(70,80,400,40);
				Font font6 = new Font("Serif", Font.BOLD, 25);
		        	l5.setFont(font6); 
				f2.add(l5);
				int a=Integer.parseInt(t[0].getText());
				int b=80,c=160,d=470,e=20;
					for(int i=1;i<=a;i++)
					{
					t[i]=new TextField(100);
					t[i].setBounds(b,c,d,e);
					c=c+40;
					f2.add(t[i]);
					}
				int bb=50,cc=160,dd=20,ee=20;
					for(int i=1;i<=a;i++)
					{
					L[i]=new Label();
					L[i].setBounds(bb,cc,dd,ee);
					Font font1 = new Font("Serif", Font.BOLD, 15);
		        		L[i].setFont(font1); 
					cc=cc+40;
					L[i].setText(i+".");
					f2.add(L[i]);
					}
				int ab=610,ac=160,ad=100,ae=20;
					for(int i=1;i<=a;i++)
					{
					t1[i]=new TextField(100);
					t1[i].setBounds(ab,ac,ad,ae);
					ac=ac+40;
					f2.add(t1[i]);
					}
				int abb=570,acc=160,add=40,aee=20;
					for(int i=1;i<=a;i++)
					{
					L1[i]=new Label();
					L1[i].setBounds(abb,acc,add,aee);
					Font font2 = new Font("Serif", Font.BOLD, 15);
		        		L1[i].setFont(font2); 
					acc=acc+40;
					L1[i].setText("ANS:");
					f2.add(L1[i]);
					}

				
				b1.setBounds(590,(c+30),90,20);
				b5.setBounds(20,40,50,20);
				Font font3 = new Font("Serif", Font.BOLD, 15);
		        	b5.setFont(font3);
				f2.add(b1);
				f2.add(b5);
				b1.addActionListener(this);
				b5.addActionListener(this);

				}
							else if(u.getActionCommand()=="Back")
							{
							 f2.setVisible(false);
							 f.setVisible(true);
							}

					else if(u.getActionCommand()=="Conduct")
					{
					 f2.setVisible(false);
					Label ll=new Label("Fill in the Blanks");
					ll.setBounds(60,80,350,30);
				try{
		   		   Font font = new Font("Serif", Font.BOLD, 30);
		   		   ll.setFont(font);
				   }catch(Exception e){}
				
				f1.add(ll);
	
		

					int a=Integer.parseInt(t[0].getText());
					int bbb=50,bcc=160,bdd=20,bee=20;
						for(int i=1;i<=a;i++)
						{
						L2[i]=new Label();
						L2[i].setBounds(bbb,bcc,bdd,bee);
						bcc=bcc+40;
						L2[i].setText(i+".");
						Font font3 = new Font("Serif", Font.BOLD, 18);
		        			L2[i].setFont(font3); 
						f1.add(L2[i]);
						}
					
					int cb=70,cc=160,cd=520,ce=20;
						for(int i=1;i<=a;i++)
						{
						L3[i]=new Label();
						L3[i].setText(t[i].getText());
						L3[i].setBounds(cb,cc,cd,ce);
						Font font4 = new Font("Serif", Font.BOLD, 15);
		        			L3[i].setFont(font4); 
						cc=cc+40;
						f1.add(L3[i]);
						}
					int aabb=610,aacc=160,aadd=110,aaee=20;
						for(int i=1;i<=a;i++)
						{
						t2[i]=new TextField(100);
						t2[i].setBounds(aabb,aacc,aadd,aaee);
						aacc=aacc+40;
						f1.add(t2[i]);
						}
					

					b3.setBounds(635,(aacc+30),90,20);
					b3.addActionListener(this);
					f1.add(b3);
					f1.setSize(750,500);
					f1.setVisible(true);
	}
					




		else if(u.getActionCommand()=="Submit")
		{
		f1.setVisible(false);
		f3.setVisible(true);
		f3.setBackground(Color.CYAN);
		f3.setLayout(null);
		f3.setSize(500,500);
				l7=new Label("Submitted Successfully");
				//l7.setForeground(Color.green);
				l7.setBounds(100,180,350,40);
				Font font5 = new Font("Serif", Font.BOLD, 30);
		        	l7.setFont(font5);



		b4.setBounds(190,260,100,25);
		Font font6 = new Font("Serif", Font.BOLD, 15);
		b4.setFont(font6);
		int i=1,rt=160;
		count=0;
		mark=Integer.parseInt(t[0].getText());
              		while(i<=mark)
			{
			String sa=t1[i].getText();
			String ca=t2[i].getText();
			
			//System.out.println(sa);
			//System.out.println(ca);
				if(sa.equalsIgnoreCase(ca))
                         	{
				count++;
				i++;
				}
			 	else 
				{
				i++;
				}
				
			rt=rt+40;	
			}
 	// label for printing you got so and so marks
	/*L4[0]=new Label();
	  L4[1]=new Label();
	L4[0].setBounds(160,(rt+100),200,20);
   	L4[0].setText("You Got : "+count+"/"+a);	
        L4[1].setBounds(100,(rt+70),100,20);
   	L4[1].setText("RESULTS : :");		
  	f1.add(L4[1]);	
  	f1.add(L4[0]);*/
			f3.add(l7);
			f3.add(b4);
			b4.addActionListener(this);

	

		}

				else if(u.getActionCommand()=="Show Results")
				{	
					f3.setVisible(false);
					f4.setVisible(true);
					f4.setSize(400,400);
					f4.setBackground(Color.CYAN);
					f4.setLayout(null);
					L4[0]=new Label();
	  				L4[1]=new Label();
					L4[0].setBounds(120,180,200,40);
  	 				L4[0].setText("You Got:  "+(count)+"  |  "+mark);
					Font font1 = new Font("Serif", Font.BOLD, 20);
		        		L4[0].setFont(font1); 
	 				L4[1].setBounds(40,120,200,40);
   	 				L4[1].setText("RESULTS ::");
					Font font = new Font("Serif", Font.BOLD, 25);
		        		L4[1].setFont(font);		
	 				f4.add(L4[1]);	
	 				f4.add(L4[0]);  
				  
				}




}
		
		public void adjustmentValueChanged(AdjustmentEvent e)
		{
			
		}
			public static void main(String[] args)
			{
				blanks bl=new blanks();
			}
}