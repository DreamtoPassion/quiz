import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.io.*;
//import javax.imageio.ImageIo;
class Myclass1 implements ActionListener
{
	Frame f,f1,f2,f3,f4;
	
	JRadioButton jr[],jr1[],jr2[],jr3[],jr4[],jr5[],jr6[],jr7[],jr8[];
	Button b1,b2,b3[],b4[],b5,b6,b7;
	TextField t[],t1[],t2[],t3[],t4[],t5[];
	Label L[],L1[],L2[],L3[],L4[],L5[],L6[],l5,l7,l8;
	int a,z;
	ButtonGroup bg2[]=new ButtonGroup[400];
	Myclass1()
	{
try{
	f=new Frame();
	f1=new Frame();
	f3=new Frame();
	
	jr=new JRadioButton[400];
	jr1=new JRadioButton[400];
	jr2=new JRadioButton[400];
	jr3=new JRadioButton[400];
	jr4=new JRadioButton[400];
	jr5=new JRadioButton[400];
	jr6=new JRadioButton[400];
	jr7=new JRadioButton[400];
	jr8=new JRadioButton[400];



				for(int i=0;i<400;i++)
				{
					jr5[i]=new JRadioButton("",false);
					jr6[i]=new JRadioButton("b",true);
					jr7[i]=new JRadioButton("",false);
					jr8[i]=new JRadioButton("",false);
				}
	b3=new Button[10];
	b4=new Button[100];
	L6=new Label[50];
	
	//t6=new TextField[100];


	b1=new Button("OK");
	b2=new Button("Conduct");
	b5=new Button("Submit");
	
	t=new TextField[50];
	L=new Label[50];
	t1=new TextField[50];
	L1=new Label[50];
	t2=new TextField[50];
	L2=new Label[50];
	t3=new TextField[50];
	L3=new Label[50];
	t4=new TextField[50];
	L4=new Label[50];
	t5=new TextField[50];
	L5=new Label[50];
	L[0]=new Label();
	L[0].setText("ENTER NUMBER OF QUESTIONS ");
	Font font = new Font("Serif", Font.ITALIC, 20);
	L[0].setFont(font);
	L[0].setBounds(50,120,300,20);
	t[0]=new TextField(100);
	t[0].setBounds(350,120,30,20);	
	f.setBackground(Color.CYAN);
	//f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("1.jpg")))));
	
	
	
	f.setLayout(null);
	f1.setLayout(null);
	b1.setBounds(360,160,40,20);
	f.add(L[0]);
	f.add(t[0]);
	f.add(b1);
	f.setTitle("Choose The Correct Answers");
	b1.addActionListener(this);
	
	f.setSize(500,400);
	f.setVisible(true);
		
		



	//setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
   }catch(NullPointerException e){}
	
	

}

public void actionPerformed(ActionEvent h)
{
String ak;
try{
	if(h.getActionCommand()=="OK")
	{

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
		b6=new Button("Back");
		a=Integer.parseInt(t[0].getText());
		int b=100,c=160,d=450,e=20;
				for(int i=1;i<=a;i++)
				{
					t[i]=new TextField(100);
					t[i].setBounds(b,c,d,e);
					c=c+120;
					f2.add(t[i]);
				}
		int bb=80,cc=160,dd=20,ee=20;
				for(int i=1;i<=a;i++)
				{
					L[i]=new Label();
					L[i].setBounds(bb,cc,dd,ee);
					cc=cc+120;
					L[i].setText(i+".");
					f2.add(L[i]);
				}
			


			//Options
				int aab=160,aac=200,aad=100,aae=20;
				for(int i=1;i<=a;i++)
				{
					t2[i]=new TextField(100);
					t2[i].setBounds(aab,aac,aad,aae);
					aac=aac+120;
					f2.add(t2[i]);
				}



				int aabb=130,aacc=200,aadd=20,aaee=20;
				 
				int cabb=300,cacc=200,cadd=20,caee=20;
				//ButtonGroup bg2=new ButtonGroup(); 
				int dabb=130,dacc=240,dadd=20,daee=20;
				//ButtonGroup bg3=new ButtonGroup(); 
				int eabb=300,eacc=240,eadd=20,eaee=20;
				//ButtonGroup bg4=new ButtonGroup();
				ButtonGroup bg1[]=new ButtonGroup[400];
								
				for(int i=1;i<=a;i++)
				{
					jr1[i]=new JRadioButton();
					jr2[i]=new JRadioButton();
					jr3[i]=new JRadioButton();
					jr4[i]=new JRadioButton();
					jr1[i].setBounds(aabb,aacc,aadd,aaee);
					jr2[i].setBounds(cabb,cacc,cadd,caee);
					jr3[i].setBounds(dabb,dacc,dadd,daee);
					jr4[i].setBounds(eabb,eacc,eadd,eaee);
					aacc=aacc+120;
					cacc=cacc+120;
					dacc=dacc+120;
					eacc=eacc+120;
					jr1[i].setText("a");
					jr2[i].setText("b");
					jr3[i].setText("c");
					jr4[i].setText("d");
					bg1[i]=new ButtonGroup();
					bg1[i].add(jr1[i]);
					bg1[i].add(jr2[i]);
					bg1[i].add(jr3[i]);
					bg1[i].add(jr4[i]);
					f2.add(jr1[i]);
					f2.add(jr2[i]);
					f2.add(jr3[i]);
					f2.add(jr4[i]);
				}
			


				int cab=340,cac=200,cad=100,cae=20;
				for(int i=1;i<=a;i++)
				{
					t3[i]=new TextField(100);
					t3[i].setBounds(cab,cac,cad,cae);
					cac=cac+120;
					f2.add(t3[i]);
				}
				




		int dab=160,dac=240,dad=100,dae=20;
				for(int i=1;i<=a;i++)
				{
					t4[i]=new TextField(100);
					t4[i].setBounds(dab,dac,dad,dae);
					dac=dac+120;
					f2.add(t4[i]);
				}
				
				

		int eab=340,eac=240,ead=100,eae=20;
				for(int i=1;i<=a;i++)
				{
					t5[i]=new TextField(100);
					t5[i].setBounds(eab,eac,ead,eae);
					eac=eac+120;
					f2.add(t5[i]);
				}
				 
				

			
				//b2.setBounds(550,(eacc-70),80,20);
				b2.setBounds(550,100,80,20);
				b2.addActionListener(this);
				b6.setBounds(20,40,50,20);
				Font font3 = new Font("Serif", Font.BOLD, 15);
		        	b6.setFont(font3);
				f2.add(b6);
				b6.addActionListener(this);
			
				f2.add(b2);

	}



					else if(h.getActionCommand()=="Back")
					{
						 f2.setVisible(false);
						 f.setVisible(true);
						 t[0].setText("");
					}
	
			



		
			else if(h.getActionCommand()=="Conduct")
			{
				f2.setVisible(false);
				Label ll=new Label("Choose the Correct answers");
				b3[0]=new Button("Prev");
				b3[1]=new Button("Next");
				ll.setBounds(60,60,370,30);
				b3[0].setBounds(300,300,50,20);
				b3[1].setBounds(351,300,50,20);
				
		 	try{
		   	    Font font = new Font("Serif", Font.BOLD, 30);
		   	    ll.setFont(font);
		     	   }catch(Exception e){}
				
				b3[0].addActionListener(this);
				b3[1].addActionListener(this);
				f1.add(ll);
				f1.add(b3[0]);
				f1.add(b3[1]);

					//int a=Integer.parseInt(t[0].getText());
					if(a<=3)
					{
					int fb=320,fc=330,fd=20,fe=20;
						for(int i=1;i<=a;i++)
						{
							b4[i]=new Button(""+i);
							b4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							f1.add(b4[i]);
							b4[i].addActionListener(this);
						}

					 }
					else if(a>3&&a<=6)
					{
					int fb=300,fc=330,fd=20,fe=20;
						for(int i=1;i<=a;i++)
						{
							b4[i]=new Button(""+i);
							b4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							f1.add(b4[i]);
							b4[i].addActionListener(this);
						}

					 }
					else if(a>6&&a<=12)
					{
						int fb=250,fc=330,fd=20,fe=20;
						for(int i=1;i<=a;i++)
						{
							b4[i]=new Button(""+i);
							b4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							f1.add(b4[i]);
							b4[i].addActionListener(this);
						}

					}
					else if(a>12&&a<=15)
					{
						int fb=200,fc=330,fd=20,fe=20;
						for(int i=1;i<=a;i++)
						{
							b4[i]=new Button(""+i);
							b4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							f1.add(b4[i]);
							b4[i].addActionListener(this);
						}

					}
					else if(a>15&&a<=20)
					{
						int fb=150,fc=330,fd=20,fe=20;
						for(int i=1;i<=a;i++)
						{
							b4[i]=new Button(""+i);
							b4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							f1.add(b4[i]);
							b4[i].addActionListener(this);
						}

					}
					else if(a>20)
					{
						int fb=98,fc=330,fd=20,fe=20;
						for(int i=1;i<=a;i++)
						{
							b4[i]=new Button(""+i);
							b4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							f1.add(b4[i]);
							b4[i].addActionListener(this);
						}

					}

		for(int i=0;i<10;i++)
		{
		L6[i]=new Label();
		}
			
					f1.setBackground(Color.CYAN);
					jr5[0].setBounds(130,200,20,20);
					jr6[0].setBounds(300,200,20,20);
					jr7[0].setBounds(130,240,20,20);
					jr8[0].setBounds(300,240,20,20);
				
			
			
					jr5[0].setText("a");
					jr6[0].setText("b");
					jr7[0].setText("c");
					jr8[0].setText("d");
					bg2[0]=new ButtonGroup();
					bg2[0].add(jr5[0]);
					bg2[0].add(jr6[0]);
					bg2[0].add(jr7[0]);
					bg2[0].add(jr8[0]);
					f1.add(jr5[0]);
					f1.add(jr6[0]);
					f1.add(jr7[0]);
					f1.add(jr8[0]);



		
		L6[0].setText(L[1].getText());
		L6[1].setText(t[1].getText());
		L6[3].setText(t2[1].getText());
		L6[5].setText(t3[1].getText());	
		L6[7].setText(t4[1].getText());
		L6[9].setText(t5[1].getText());


		L6[0].setBounds(80,160,20,20);
		L6[1].setBounds(100,160,450,20);
		L6[3].setBounds(160,200,120,20);
		L6[5].setBounds(340,200,120,20);	
		L6[7].setBounds(160,240,100,20);
		L6[9].setBounds(340,240,100,20);



		for(int i=0;i<10;i++)
		{
		f1.add(L6[i]);
		}
			
				b5.setBounds(550,370,100,20);
				f1.add(b5);
				b5.addActionListener(this);
				f1.setSize(750,500);
				f1.setVisible(true);	
			}

										







		

      else if(h.getActionCommand()=="Prev")
      {
				//String zzz=L[1].getText();
				//System.out.println(zzz);
				//String m=h.getActionCommand();
				//int z=Integer.parseInt(m);
		
			
		if(z==1)
		{
			L6[0].setText(L[z].getText());
			L6[1].setText(t[z].getText());
			L6[3].setText(t2[z].getText());
			L6[5].setText(t3[z].getText());	
			L6[7].setText(t4[z].getText());
			L6[9].setText(t5[z].getText());


			L6[0].setBounds(80,160,20,20);
			L6[1].setBounds(100,160,450,20);
			L6[3].setBounds(160,200,120,20);
			L6[5].setBounds(340,200,120,20);
			L6[7].setBounds(160,240,100,20);
			L6[9].setBounds(340,240,100,20);


							
					jr5[z].setBounds(130,200,20,20);
					jr6[z].setBounds(300,200,20,20);
					jr7[z].setBounds(130,240,20,20);
					jr8[z].setBounds(300,240,20,20);
				
			
			
					jr5[z].setText("a");
					jr6[z].setText("b");
					jr7[z].setText("c");
					jr8[z].setText("d");
					bg2[z]=new ButtonGroup();
					bg2[z].add(jr5[z]);
					bg2[z].add(jr6[z]);
					bg2[z].add(jr7[z]);
					bg2[z].add(jr8[z]);
					f1.add(jr5[z]);
					f1.add(jr6[z]);
					f1.add(jr7[z]);
					f1.add(jr8[z]);

				


		}
		else
		{
			L6[0].setText(L[z-1].getText());
			L6[1].setText(t[z-1].getText());
			L6[3].setText(t2[z-1].getText());
			L6[5].setText(t3[z-1].getText());	
			L6[7].setText(t4[z-1].getText());
			L6[9].setText(t5[z-1].getText());


			L6[0].setBounds(80,160,20,20);
			L6[1].setBounds(100,160,450,20);
			L6[3].setBounds(160,200,120,20);
			L6[5].setBounds(340,200,120,20);
			L6[7].setBounds(160,240,100,20);
			L6[9].setBounds(340,240,100,20);



							
					jr5[z-1].setBounds(130,200,20,20);
					jr6[z-1].setBounds(300,200,20,20);
					jr7[z-1].setBounds(130,240,20,20);
					jr8[z-1].setBounds(300,240,20,20);
				
			
			
					jr5[z-1].setText("a");
					jr6[z-1].setText("b");
					jr7[z-1].setText("c");
					jr8[z-1].setText("d");
					bg2[z-1]=new ButtonGroup();
					bg2[z-1].add(jr5[z-1]);
					bg2[z-1].add(jr6[z-1]);
					bg2[z-1].add(jr7[z-1]);
					bg2[z-1].add(jr8[z-1]);
					f1.add(jr5[z-1]);
					f1.add(jr6[z-1]);
					f1.add(jr7[z-1]);
					f1.add(jr8[z-1]);





		}

			


			for(int i=0;i<10;i++)
			{
			f1.add(L6[i]);
			}
			
			if(z==1)
			{
			}
			else
			{
			 z=z-1;
			}
				
	}





  		else if(h.getActionCommand()=="Next")
		{
				//String zz=h.getActionCommand();
				//System.out.println(zz);
				//String m=h.getActionCommand();
				//int z=Integer.parseInt(m);

		L6[0].setText(L[z+1].getText());
		L6[1].setText(t[z+1].getText());
		L6[3].setText(t2[z+1].getText());
		L6[5].setText(t3[z+1].getText());	
		L6[7].setText(t4[z+1].getText());
		L6[9].setText(t5[z+1].getText());


		
		L6[0].setBounds(80,160,20,20);
		L6[1].setBounds(100,160,450,20);
		L6[3].setBounds(160,200,120,20);
		L6[5].setBounds(340,200,120,20);
		L6[7].setBounds(160,240,100,20);
		L6[9].setBounds(340,240,100,20);


						
					jr5[z+1].setBounds(130,200,20,20);
					jr6[z+1].setBounds(300,200,20,20);
					jr7[z+1].setBounds(130,240,20,20);
					jr8[z+1].setBounds(300,240,20,20);
				
			
			
					jr5[z+1].setText("a");
					jr6[z+1].setText("b");
					jr7[z+1].setText("c");
					jr8[z+1].setText("d");
					bg2[z+1]=new ButtonGroup();
					bg2[z+1].add(jr5[z+1]);
					bg2[z+1].add(jr6[z+1]);
					bg2[z+1].add(jr7[z+1]);
					bg2[z+1].add(jr8[z+1]);
					f1.add(jr5[z+1]);
					f1.add(jr6[z+1]);
					f1.add(jr7[z+1]);
					f1.add(jr8[z+1]);






		for(int i=0;i<10;i++)
		{
		f1.add(L6[i]);
		}
		
		z=z+1;

	}


	





							else if(h.getActionCommand()=="Submit")
							{
								f1.setVisible(false);
								f3.setSize(500,500);
								f3.setVisible(true);
								
								f3.setBackground(Color.CYAN);
								f3.setLayout(null);
			
								l7=new Label("Submitted Successfully");
								//l7.setForeground(Color.green);
								l7.setBounds(100,180,350,40);
								Font font5 = new Font("Serif", Font.BOLD, 30);
		        					l7.setFont(font5);

								b7=new Button("Show Results");
								b7.setBounds(190,260,100,25);
								Font font6 = new Font("Serif", Font.BOLD, 15);
								b7.setFont(font6);
								//int i=1,rt=160;
		
								//mark=Integer.parseInt(t[0].getText());
              		
 								// label for printing you got so and so marks

								/*L4[1]=new Label();
								L4[0].setBounds(160,(rt+100),200,20);
   								L4[0].setText("You Got : "+count+"/"+a);	
        							L4[1].setBounds(100,(rt+70),100,20);
   								L4[1].setText("RESULTS : :");*/
								f3.add(l7);
								f3.add(b7);
								b7.addActionListener(this);
							
							}














				else if(h.getActionCommand()=="Show Results")
				{
					f3.setVisible(false);
					f4=new Frame();
					f4.setVisible(true);
					f4.setSize(400,400);
					f4.setBackground(Color.CYAN);
					f4.setLayout(null);
					l8=new Label();
	  				/*L4[0]=new Label();
					L4[0].setBounds(120,180,200,40);
  	 				L4[0].setText("You Got:  "+(count)+"  |  "+mark);
					Font font1 = new Font("Serif", Font.BOLD, 20);
		        		L4[0].setFont(font1); */
	 				l8.setBounds(40,120,200,40);
   	 				l8.setText("RESULTS ::");
					Font font = new Font("Serif", Font.BOLD, 25);
		        		l8.setFont(font);		
	 				f4.add(l8);	
	 				//f4.add(L4[0]);  
					

				}			










						String m=h.getActionCommand();
	
				if(((h.getActionCommand()).equals(m)))
				{
		 		z=Integer.parseInt(m);

				L6[0].setText(L[z].getText());
				L6[1].setText(t[z].getText());
				L6[3].setText(t2[z].getText());
				L6[5].setText(t3[z].getText());	
				L6[7].setText(t4[z].getText());
				L6[9].setText(t5[z].getText());

				L6[0].setBounds(80,160,20,20);
				L6[1].setBounds(100,160,450,20);
				L6[3].setBounds(160,200,120,20);
				L6[5].setBounds(340,200,120,20);
				L6[7].setBounds(160,240,100,20);
				L6[9].setBounds(340,240,100,20);
		
		
		for(int i=0;i<10;i++)
		{
		f1.add(L6[i]);
		}

			
					jr5[z].setText("a");
					jr6[z].setText("b");
					jr7[z].setText("c");
					jr8[z].setText("d");
					bg2[z]=new ButtonGroup();
					bg2[z].add(jr5[z]);
					bg2[z].add(jr6[z]);
					bg2[z].add(jr7[z]);
					bg2[z].add(jr7[z]);

					jr5[z].setBounds(130,200,20,20);
					jr6[z].setBounds(300,200,20,20);
					jr7[z].setBounds(130,240,20,20);
					jr8[z].setBounds(300,240,20,20);
					

					f1.add(jr5[z]);
					f1.add(jr6[z]);
					f1.add(jr7[z]);
					f1.add(jr8[z]);
				
		}





			

		


			/*else if(h.getActionCommand()==("2"))
			{
				ak=h.getActionCommand();
				int kr=Integer.parseInt(ak);
					jr5[kr].setText("a");
					jr6[kr].setText("b");
					jr7[kr].setText("c");
					jr8[kr].setText("d");
					bg2[kr]=new ButtonGroup();
					bg2[kr].add(jr5[z]);
					bg2[kr].add(jr6[z]);
					bg2[kr].add(jr7[z]);
					bg2[kr].add(jr7[z]);

					jr5[kr].setBounds(130,200,20,20);
					jr6[kr].setBounds(300,200,20,20);
					jr7[kr].setBounds(130,240,20,20);
					jr8[kr].setBounds(300,240,20,20);
					

					f1.add(jr5[kr]);
					f1.add(jr6[kr]);
					f1.add(jr7[kr]);
					f1.add(jr8[kr]);
			
			}*/
			



		
							


	}catch(Exception eee){}
	

}	

			public static void main(String f[])
			{

				Myclass1 g=new Myclass1();

			}

}