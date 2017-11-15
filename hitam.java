import java.awt.*;
import java.awt.event.*;
class hitam extends Frame implements ActionListener
{
  Button b,b2,b5;
  TextField t[];
  Frame f1,f2,f3,f4;
  Label l[],l1[],l2[],l3[],l4[],l5[],l6,l7;
  int count;
   hitam()
	{  
		// objects 
		b=new Button("Conduct");
		b2=new Button("Submit");
		b5=new Button("Show Results");
                t=new TextField[22];
 		l=new Label[8];
		l1=new Label[12];
		l2=new Label[12];
		l3=new Label[12];
		l4=new Label[12];
		l5=new Label[12];
		

                	for(int i=0;i<8;i++)
			{
 			l[i]=new Label();
			}

				for(int n=0;n<12;n++)
				{
					l1[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					l2[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					l3[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					l4[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					l5[n]=new Label();
				}
				l[7]=new Label("Match The Following");


		for(int i=0;i<22;i++)
		{
			t[i]=new TextField(20); 
		}
		f1=new Frame();
		f2=new Frame();
		f3=new Frame();
		f4=new Frame();

		// layout setting for textfield

 		f1.setLayout(null);
		 t[0].setBounds(100,100,120,20);
                 t[1].setBounds(100,130,120,20);
                 t[2].setBounds(100,160,120,20);
		 t[3].setBounds(100,190,120,20);
		 t[4].setBounds(100,220,120,20);
		 t[5].setBounds(230,100,20,20);
		 t[6].setBounds(230,130,20,20);
		 t[7].setBounds(230,160,20,20);
		 t[8].setBounds(230,190,20,20);
		 t[9].setBounds(230,220,20,20);
		 t[10].setBounds(300,100,120,20);
		 t[11].setBounds(300,130,120,20);
		 t[12].setBounds(300,160,120,20);
		 t[13].setBounds(300,190,120,20);
		 t[14].setBounds(300,220,120,20);
		 t[15].setBounds(300,250,120,20);
		 t[16].setBounds(300,280,120,20);
			 
                  l1[6].setBounds(80,320,130,20);
                  l1[6].setText("Give Answers:");
			Font font1 = new Font("Serif", Font.BOLD, 15);
		        l1[6].setFont(font1);
			f1.add(l1[6]);

			int aa=210,bb=320,cc=20,dd=20;
			for(int z=17;z<22;z++)
			{
			 t[z].setBounds(aa,bb,cc,dd);
                                 aa=aa+35;
			f1.add(t[z]);
			}




 
		// layout setting for label printing question numbers
			
		int aaa=70,bbb=100,ccc=20,ddd=20;
			for(int z=0;z<5;z++)
			{
			 l1[z].setBounds(aaa,bbb,ccc,ddd);
                                 bbb=bbb+30;
			l1[z].setText(""+(z+1)+".")	;
			Font font2 = new Font("Serif", Font.BOLD, 15);
		        l1[z].setFont(font2);
			f1.add(l1[z]);
			
			}
			
			//title set
                     f1.setTitle("KOVIZ");
			
                     f2.setTitle("KOVIZ");

			// layout setting for label
		 l[0].setBounds(270,100,100,20);
                 l[1].setBounds(270,130,100,20);
                 l[2].setBounds(270,160,100,20);
		 l[3].setBounds(270,190,100,20);
		 l[4].setBounds(270,220,100,20);
		 l[5].setBounds(270,250,100,20);
		 l[6].setBounds(270,280,100,20);
		 l[7].setBounds(135,40,350,40);	
		
			// for adding textfield on frame1
			for(int i=0;i<5;i++)
				{
				 f1.add(t[i]);
				}
			
			for(int i=10;i<17;i++)
				{
				 f1.add(t[i]);
				}
         	// setting alphabet order for answers with label
                 l[0].setText("a.");
                 l[1].setText("b.");
                 l[2].setText("c.");
		 l[3].setText("d.");
		 l[4].setText("e.");	
		 l[5].setText("f.");
		 l[6].setText("g.");

			// for adding label	
                      for(int i=0;i<7;i++)
			{
				Font font3 = new Font("Serif", Font.BOLD, 15);
		        	l[i].setFont(font3);
				f1.add(l[i]);
			}


				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
		        	   l[7].setFont(font);
				   }catch(Exception e){}









		// layout setting for button
               b.setBounds(310,360,55,20);

		f1.setBackground(Color.CYAN);
		f1.setVisible(true);
		
		f1.setSize(490,420);
		
                f1.add(b);
        	f1.add(l[7]);
        	// making button to listen what we say
                b.addActionListener(this);
		add(f1);
		
 		
		
	}
public void actionPerformed(ActionEvent e) 
   {
		
                    
			if(e.getActionCommand()=="Conduct")
			{
				l6=new Label("Match The Following");
				l6.setBounds(135,40,350,40);
				Font font5 = new Font("Serif", Font.BOLD, 25);
		        	l6.setFont(font5);
				try{
				   String a[]=new String[5];
		
					for(int j=0;j<5;j++)
					{
			  		a[j]=t[j].getText();
					}
				   int aa=100,bb=100,cc=120,dd=20;
               				for(int z=0;z<5;z++)
					{
			 		l2[z].setBounds(aa,bb,cc,dd);
                                 	bb=bb+30;
					l2[z].setText(a[z]);
					Font font = new Font("Serif", Font.BOLD, 15);
		        		l2[z].setFont(font);
					f2.add(l2[z]);
					}
			
     				   String r[]=new String[25];
	 
     					for(int k=10;k<17;k++)
					{
					 r[k]=t[k].getText();
					}
         	
					
				int ee=290,ff=100,gg=120,hh=20;
 			for(int v=0,ra=10;v<7&&ra<17;v++,ra++)
			{
			 l3[v].setBounds(ee,ff,gg,hh);
			 ff=ff+30;
			 l3[v].setText(r[ra]);
			 Font font1 = new Font("Serif", Font.BOLD, 15);
		         l3[v].setFont(font1);
			 f2.add(l3[v]);
			}
				for(int ii=5;ii<10;ii++)
				{
				 f2.add(t[ii]);
				}
		int aaa=70,bbb=100,ccc=20,ddd=20;
			for(int z=0;z<5;z++)
			{
			 l4[z].setBounds(aaa,bbb,ccc,ddd);
                         bbb=bbb+30;
			 l4[z].setText(""+(z+1)+".");
			 Font font2 = new Font("Serif", Font.BOLD, 15);
		         l4[z].setFont(font2);
			 f2.add(l4[z]);
			}
		 
                
		int rk=270,rk1=100,rk2=20,rk3=20;
			for(int zz=0;zz<7;zz++)
			{
			
			l5[zz].setBounds(rk,rk1,rk2,rk3);
			rk1=rk1+30;
			}


		 l5[0].setText("a.");
                 l5[1].setText("b.");
                 l5[2].setText("c.");
		 l5[3].setText("d.");
		 l5[4].setText("e.");	
		 l5[5].setText("f.");
		 l5[6].setText("g.");
			for(int mk=0;mk<7;mk++)
			{
			Font font4 = new Font("Serif", Font.BOLD, 15);
		        l5[mk].setFont(font4);
			f2.add(l5[mk]);
			}
			 b2.addActionListener(this);
		   	 b2.setBounds(350,320,50,20);
			 f2.add(b2);
		f2.setBackground(Color.CYAN);
		f2.setLayout(null);
		f2.setVisible(true);
		f2.setSize(500,400);
		f2.add(l6);
		add(f2);
		
				}catch(Exception eee){}
  }

	


		else if(e.getActionCommand()=="Submit")
		{
		f1.setVisible(false);
		f2.setVisible(false);
		
    		  int i=5,rt=17;
		  count=0;
                	 while(i<10&&rt<22)
		 	 {
                      	String sa=t[i].getText();
			String ca=t[rt].getText();
			
			//System.out.println(sa);
			//System.out.println(ca);
				if(sa.equalsIgnoreCase(ca))
                         	{
				count++;
				}
				i++;
				rt++;
 				
				
		}



 	
   	 

				l7=new Label("Submitted Successfully");
				//l7.setForeground(Color.green);
				l7.setBounds(100,180,350,40);
				Font font5 = new Font("Serif", Font.BOLD, 30);
		        	l7.setFont(font5);


			f3.setBackground(Color.CYAN);
			f3.setLayout(null);
			b5.setBounds(190,260,100,25);
			Font font6 = new Font("Serif", Font.BOLD, 15);
		        b5.setFont(font6);
			f3.setVisible(true);
			f3.setSize(500,500);
		        
			f3.add(l7);
			f3.add(b5);
			b5.addActionListener(this);
			
	


}
				else if(e.getActionCommand()=="Show Results")
				{	
					f3.setVisible(false);
					f4.setVisible(true);
					f4.setSize(400,400);
					f4.setBackground(Color.CYAN);
					f4.setLayout(null);
					l1[7].setBounds(120,180,200,40);
  	 				l1[7].setText("You Got:  "+(count)+"  |  5");
					Font font1 = new Font("Serif", Font.BOLD, 20);
		        		l1[7].setFont(font1); 
	 				l1[8].setBounds(40,120,200,40);
   	 				l1[8].setText("RESULTS ::");
					Font font = new Font("Serif", Font.BOLD, 25);
		        		l1[8].setFont(font);		
	 				f4.add(l1[8]);	
	 				f4.add(l1[7]);  
				  
				}

}
		public static void main(String[] args) 
		{
 		hitam h=new hitam();
		}

}