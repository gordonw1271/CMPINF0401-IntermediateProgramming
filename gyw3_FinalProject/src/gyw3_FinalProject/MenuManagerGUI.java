package gyw3_FinalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuManagerGUI {
	
	private MenuManager menuManager;
	private JFrame frame;
	private JFrame frame1;
	private JLabel lE = new JLabel("Entree");
	private JLabel lSi = new JLabel("Side");
	private JLabel lSa = new JLabel("Salad");
	private JLabel lD = new JLabel("Dessert");
	private JLabel lE1 = new JLabel("Entree");
	private JLabel lSi1 = new JLabel("Side");
	private JLabel lSa1 = new JLabel("Salad");
	private JLabel lD1 = new JLabel("Dessert");
	private JLabel l = new JLabel("Created Menus:");
	private JLabel l1 = new JLabel("Total Calories");
	private JLabel l2 = new JLabel("Total Price");
	private JLabel eDesc;
	private JLabel siDesc;
	private JLabel saDesc;
	private JLabel dDesc;
	private JLabel eDesc1;
	private JLabel siDesc1;
	private JLabel saDesc1;
	private JLabel dDesc1;
	private JLabel calories;
	private JLabel price;
	private JComboBox jComE;  
	private JComboBox jComSi;
	private JComboBox jComSa;
	private JComboBox jComD;
	private JButton b1 = new JButton("Create Menu with these dishes");
	private JButton b2 = new JButton("Generate a Random Menu");
	private JButton b3 = new JButton("Generate a Minimum Calories Menu");
	private JButton b4 = new JButton("Generate a Maximum Calories Menu");
	private JButton b5 = new JButton("Details");
	private JButton b6 = new JButton("Delete all");
	private JButton b7 = new JButton("Save to file");
	private JList<Menu> li;
	
	public MenuManagerGUI() {
		
		menuManager = new MenuManager("data/dishes.txt");
		
		////////////////////////////////////////////////////////////////
		//Build Your Own Menu Panel
		jComE = new JComboBox(menuManager.getEntreeArray().toArray(new Entree[0]));
		jComE.setBounds(175,30,195,40);
	
		jComSi = new JComboBox(menuManager.getSideArray().toArray(new Side[0]));
		jComSi.setBounds(175,90,195,40);
		
		jComSa = new JComboBox(menuManager.getSaladArray().toArray(new Salad[0]));
		jComSa.setBounds(175,150,195,40);
		
		jComD = new JComboBox(menuManager.getDessertArray().toArray(new Dessert[0]));
		jComD.setBounds(175,210,195,40);
		
		lE.setBounds(60,20,50,50);
		lSi.setBounds(60,80,50,50);
		lSa.setBounds(60,140,50,50);
		lD.setBounds(60,200,50,50);
		
		b1.setBounds(30,275,340,35);
		
		//Create Menu button 
		final DefaultListModel model = new DefaultListModel();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What is the name of this menu?");
				while(name.equals("")) {
					name = JOptionPane.showInputDialog("Please enter a name for this menu?");
				}
				Entree e1 = (Entree) jComE.getSelectedItem();
				Side si1 = (Side) jComSi.getSelectedItem();
				Salad sa1 = (Salad) jComSa.getSelectedItem();
				Dessert d1 = (Dessert) jComD.getSelectedItem();
				Menu m = new Menu(name,e1,si1,sa1,d1);
				model.addElement(m);
			}
		});
		// Random Menu Button
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What is the name of this random menu?");
				while(name.equals("")) {
					name = JOptionPane.showInputDialog("Please enter a name for this random menu?");
				}
				model.addElement(menuManager.randomMenu(name));
			}
		});
		// Min Calories
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What is the name of this minimum calories menu?");
				while(name.equals("")) {
					name = JOptionPane.showInputDialog("Please enter a name for this minimum calories menu?");
				}
				model.addElement(menuManager.minCaloriesMenu(name));
			}
		});
		// Max Calories
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What is the name of this maximum calories menu?");
				while(name.equals("")) {
					name = JOptionPane.showInputDialog("Please enter a name for this maximum calories menu?");
				}
				model.addElement(menuManager.maxCaloriesMenu(name));
			}
		});
		
		JPanel p = new JPanel(null); 
		p.setName("Build your own Menu");
		p.setBounds(0,0,400,350);
		p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Build your own Menu"));
		p.add(jComE);
		p.add(jComSa);
		p.add(jComSi);
		p.add(jComD);
		p.add(lE);
		p.add(lSi);
		p.add(lSa);
		p.add(lD);
		p.add(b1);
		
		////////////////////////////////////////////////////////////
		// Or Generate a Menu Panel
		b2.setBounds(30,40,340,35);
		b3.setBounds(30,110,340,35);
		b4.setBounds(30,180,340,35);
		
		JPanel p1 = new JPanel(null); 
		p1.setName("Or generate a Menu");
		p1.setBounds(0,350,400,250);
		p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Or generate a Menu"));
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		/////////////////////////////////////////////////////////////
		// Created Menus
		JPanel p2 = new JPanel(null); 
		p2.setBounds(420,45,300,520);
		p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
		li = new JList(model);
		li.setBounds(10,10,280,500);
		p2.add(li);
		// Details Button
	
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(li.getSelectedValue() != null) {
					JPanel p3 = new JPanel(null);
					JPanel p4 = new JPanel(null);
					JPanel p5 = new JPanel(null);
					JPanel p6 = new JPanel(null);
					JPanel p7 = new JPanel(null);
					JPanel p8 = new JPanel(null);
					p3.setBounds(200,20,700,80);
					p4.setBounds(200,120,700,80);
					p5.setBounds(200,220,700,80);
					p6.setBounds(200,320,700,80);
					p7.setBounds(200,430,100,40);
					p8.setBounds(200,500,100,40);
					p3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
					p4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
					p5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
					p6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
					p7.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
					p8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
					lE1.setBounds(20,0,100,50);
					lSi1.setBounds(20,100,100,50);
					lSa1.setBounds(20,200,100,50);
					lD1.setBounds(20,300,100,50);
					l1.setBounds(20,420,100,50);
					l2.setBounds(20,490,100,50);
					eDesc = new JLabel(li.getSelectedValue().getEntree().getName());
					eDesc.setBounds(5,0,450,20);
					siDesc = new JLabel(li.getSelectedValue().getSide().getName());
					siDesc.setBounds(5,0,450,20);
					saDesc = new JLabel(li.getSelectedValue().getSalad().getName());
					saDesc.setBounds(5,0,450,20);
					dDesc = new JLabel(li.getSelectedValue().getDessert().getName());
					dDesc.setBounds(5,0,450,20);
					eDesc1 = new JLabel(li.getSelectedValue().getEntree().getDescription());
					eDesc1.setBounds(5,30,700,20);
					siDesc1 = new JLabel(li.getSelectedValue().getSide().getDescription());
					siDesc1.setBounds(5,30,700,20);
					saDesc1 = new JLabel(li.getSelectedValue().getSalad().getDescription());
					saDesc1.setBounds(5,30,700,20);
					dDesc1 = new JLabel(li.getSelectedValue().getDessert().getDescription());
					dDesc1.setBounds(5,30,700,20);
					calories = new JLabel("" + li.getSelectedValue().totalCalories());
					calories.setBounds(10,10,50,10);
					double p = li.getSelectedValue().getEntree().getPrice()+li.getSelectedValue().getSide().getPrice()+li.getSelectedValue().getSalad().getPrice()+li.getSelectedValue().getDessert().getPrice();
					price = new JLabel("" + p);
					price.setBounds(10,10,50,10);
					
					frame1 = new JFrame("Menu: "+ li.getSelectedValue());
					frame1.setVisible(true);
					frame1.setLocationRelativeTo(null);
					frame1.setSize(945, 650);
					frame1.getContentPane().setLayout(null);
					p3.add(eDesc);
					p3.add(eDesc1);
					p4.add(siDesc);
					p4.add(siDesc1);
					p5.add(saDesc);
					p5.add(saDesc1);
					p6.add(dDesc);
					p6.add(dDesc1);
					p7.add(calories);
					p8.add(price);
					frame1.add(lE1);
					frame1.add(lSi1);
					frame1.add(lSa1);
					frame1.add(lD1);
					frame1.add(l1);
					frame1.add(l2);
					frame1.add(p3);
					frame1.add(p4);
					frame1.add(p5);
					frame1.add(p6);
					frame1.add(p7);
					frame1.add(p8);
				}else {
					return;
				}
			}
		});
		// Delete All Button
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeAllElements();
			}
		});
		// Save to File Button
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Menu> m = new ArrayList<>();
				for(int i=0;i<model.toArray().length;i++) {
					m.add((Menu) model.getElementAt(i));
				}
				FileManager.writeMenus("data/menus.txt", m);
			}
		});
		
		/////////////////////////////////////////////////////////////
		frame = new JFrame("Menu Manager");
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(745, 650);
		
		frame.add(p);
		frame.add(p1);
		frame.add(p2);
		l.setBounds(425,0,100,50);
		frame.add(l);
		b5.setBounds(400,570,100,30);
		b6.setBounds(510,570,100,30);
		b7.setBounds(620,570,100,30);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		////////////////////////////////////////////////////
	}

	public static void main(String[] args) {
		
		MenuManagerGUI GUI = new MenuManagerGUI();
		GUI.frame.setVisible(true);
		

	}

}
