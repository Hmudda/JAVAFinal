import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//Jordan Babb
//OCCC Advanced Java
//FINAL PROJECT!

public class JB_VitMin extends JPanel implements ActionListener{
	
	public static final int WIDTH = 400;
	public static final int HEIGHT = 400;
	
	Color c;
	
	
	JLabel l;
	JButton b;
	JTextField t;
	
	
	
	JButton reset;
	
	JButton buildButton;
	JButton buildMineralButton;
	JTextArea buildText;
	JTextArea buildMineralText;
	JTextArea foundItem;
	//JTextArea search;
	
	
	JComboBox<String> vitaminMenu;
	JComboBox<String> mineralMenu;
	
	String [] vitaminList;
	String [][] rda;
	
	String [] mineralList;
	String [][] rdam;
	
	JCheckBox option_audio, option_colorful, option_booster;
	
	
	public JB_VitMin(){
		this.setLayout(new BorderLayout());

		JPanel titlePanel   = new JPanel();
		JPanel computerPanel     = new JPanel();
		JPanel optionsPanel = new JPanel();
		JPanel buildPanel   = new JPanel();
	
		JPanel centerPanel  = new JPanel();
		JPanel leftPanel  = new JPanel();
		JPanel rightPanel  = new JPanel();
		JPanel underCenterPanel  = new JPanel();

		Font appFontLarge = new Font("Arial", Font.PLAIN, 50);
		Font appFontSmall = new Font("Arial", Font.PLAIN, 18);
		
		
		
		
		
		 // title

    JLabel titleLabel   = new JLabel("Vitamins! Minerals! And Where To Find Them!");
    titleLabel.setFont(appFontLarge);
    titlePanel.add(titleLabel);


	
	
		
		 // vitamin list and foods
		 
		 vitaminList = new String[]
		 {"Vitamin A","Vitamin B1", "Vitamin B2", "Vitamin B3", "Vitamin B5", "Vitamin B6", "Vitamin B12", "Vitamin C", "Vitamin D", "Vitamin E", "Vitamin B9", "Vitamin K"};
		 rda = new String[12][];
		rda[0] = new String [] 
			{"RDA: M-900 mcg", "RDA: W-700 mcg", "Beef Liver", "Eggs", "Shrimp", "Butter", "Cheddar Cheese"};
		rda[1] = new String [] 
			{"RDA: M-1.2 mg", "RDA: W-1.1 mg", "Pork Chops", "Brown Rice", "Ham", "SoyMilk", "Watermelons"};
		rda[2] = new String [] 
			{"RDA: M-1.3 mg", "RDA: W-1.1 mg", "Milk", "Eggs", "Yogurt", "Cheese", "Meat"};
		rda[3] = new String [] 
			{"RDA: M-16 mg", "RDA: W-14 mg", "Meat", "Poultry", "Fish", "Mushrooms", "Potatoes"};
		rda[4] = new String [] 
			{"RDA: M-5 mg", "RDA: W-5 mg", "Chicken", "Egg Yolk", "Whole Grains", "Broccoli", "Avocados"};
		rda[5] = new String [] 
			{"RDA: M-1.3 mg", "RDA: W-1.3 mg", "Meat", "Fish", "Poultry", "Legumes", "Tofu"};
		rda[6] = new String [] 
			{"RDA: M-2.4 mg", "RDA: W-2.4 mg", "Meat", "Poultry", "Fish", "Milk", "Cheese"};
		rda[7] = new String [] 
			{"RDA: M-90 mg", "RDA: W-75 mg", "Fruits(citrus)", "Potatoes", "Broccoli", "Bell Peppers", "Spinach"};
		rda[8] = new String [] 
			{"RDA: M-15 mcg", "RDA: W-15 mcg", "Fortified Milk", "Margarine", "Fortified Cereals", "Fatty Fish", "Sunlight"};
		rda[9] = new String [] 
			{"RDA: M-15 mg", "RDA: W-15 mg", "Vegetable Oil", "Salad Dressing", "Wheat Germ", "Whole Grains", "Nuts"};
		rda[10] = new String [] 
			{"RDA: M-400 mcg", "RDA: W-400 mcg", "Asparagus", "Okra", "Spinach", "Turnip Greens", "Legumes"};
		rda[11] = new String [] 
			{"RDA: M-120 mcg", "RDA: W-90 mcg", "Cabbage", "Liver", "Eggs", "Milk", "Spinach"};
		 

	   
	   
	   
	   //this creates a Vitamin Menu
	   vitaminMenu = new JComboBox<String>(vitaminList);
	   vitaminMenu.setFont(appFontSmall);
	   
	   
	   //mineral list and food
	   
	   mineralList = new String[]
		 {"Calcium","Chloride", "Chromium", "Copper", "Fluoride", "Iodine", "Iron", "Magnesium", "Potassium", "Sodium", "Sulfur", "Zinc"};
		 rdam = new String[12][];
		rdam[0] = new String [] 
			{"RDA: M-1000 mg", "RDA: W-1000 mg", "Yogurt", "Cheese", "Milk", "Tofu", "Broccoli"};
		rdam[1] = new String [] 
			{"RDA: M-2.3 g", "RDA: W-2.3 g", "Salt", "Soy Sauce", "Processed Food"};
		rdam[2] = new String [] 
			{"RDA: M-35 mcg", "RDA: W-25 mcg", "Meat", "Poultry", "Eggs", "Potatoes", "Cheese"};
		rdam[3] = new String [] 
			{"RDA: M-900 mcg", "RDA: W-900 mcg", "Liver", "Shellfish", "Nuts", "Seeds", "Cocoa"};
		rdam[4] = new String [] 
			{"RDA: M-4 mg", "RDA: W-3 mg", "Water", "Toothpaste", "Marine Fish", "Tea"};
		rdam[5] = new String [] 
			{"RDA: M-150 mcg", "RDA: W-150 mcg", "Salt", "Processed Food", "Seafood"};
		rdam[6] = new String [] 
			{"RDA: M-8 mg", "RDA: W-18 mg", "Meat", "Poultry", "Eggs", "Fruit", "Bread"};
		rdam[7] = new String [] 
			{"RDA: M-420 mg", "RDA: W-320 mg", "Spinach", "Legumes", "Broccoli", "Cashews", "Milk"};
		rdam[8] = new String [] 
			{"RDA: M-4.7 g", "RDA: W-4.7 g", "Meat", "Milk", "Fruit", "Grains", "Legumes"};
		rdam[9] = new String [] 
			{"RDA: M-2300 mg", "RDA: W-2300 mg", "Salt", "Soy Sauce", "Processed Food", "Vegetabless"};
		rdam[10] = new String [] 
			{"RDA: M-UNKNOWN", "RDA: W-UNKNOWN", "Protein", "Meat", "Fish", "Poultry", "Nuts"};
		rdam[11] = new String [] 
			{"RDA: M-11 mg", "RDA: W-8 mg", "Meat", "Poultry", "Oysters", "Legumes", "Nuts"};
	   
	   
	   	   //this creates a Mineral Menu
	   mineralMenu = new JComboBox<String>(mineralList);
	   mineralMenu.setFont(appFontSmall);
	   
	   
	   

 
 
 // This is the text area containing Vitamin Information + button

    buildText = new JTextArea(12, 20);
    buildText.setFont(appFontSmall);
    buildButton = new JButton("Vitamin Info");
    buildButton.setFont(appFontSmall);
    buildText.setText("Choose a Vitamin and see info!");
	
	
	//This is the text are containing Mineral Information + button
	
	buildMineralText = new JTextArea(12, 20);
    buildMineralText.setFont(appFontSmall);
    buildMineralButton = new JButton("Mineral Info");
    buildMineralButton.setFont(appFontSmall);
    buildMineralText.setText("Choose a Mineral and see info!");
 
 
 //This sets positioning of the Vitamin and Mineral Information textArea
 //also adds buttons and combobox
 
 
 
 
 
 JPanel upperBuild = new JPanel();
 JPanel lowerBuild = new JPanel();
 JPanel lowerBuildLeft = new JPanel();
 JPanel upperBuildLeft = new JPanel();
 
 
 
 leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
 rightPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
 upperBuild.setLayout(new BoxLayout(upperBuild, BoxLayout.Y_AXIS));
upperBuildLeft.setLayout(new BoxLayout(upperBuildLeft, BoxLayout.Y_AXIS));
 upperBuild.add(vitaminMenu, upperBuild);
 upperBuild.add(buildText, upperBuild);
 upperBuild.add(buildButton, upperBuild);
 upperBuildLeft.add(mineralMenu, upperBuildLeft);
 upperBuildLeft.add(buildMineralText, upperBuildLeft);
 upperBuildLeft.add(buildMineralButton, upperBuildLeft);
 
 leftPanel.add(upperBuild);
 rightPanel.add(upperBuildLeft);
 
 centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));


 
  //adds food search components
 foundItem = new JTextArea(20, 20);
 foundItem.setFont(appFontSmall);
 optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
 l = new JLabel("Enter Food Item Eaten Here(Be Generic)");
 b = new JButton("submit");
 t = new JTextField(16);
  reset = new JButton("Reset");
optionsPanel.add(l, optionsPanel);
optionsPanel.add(t ,optionsPanel);
optionsPanel.add(b, optionsPanel);
optionsPanel.add(foundItem, optionsPanel);
optionsPanel.add(reset, optionsPanel);
 
 

 
 
 JPanel optionsLabelPanel = new JPanel(new    
 FlowLayout(FlowLayout.CENTER));
 centerPanel.add(optionsLabelPanel);
 
  centerPanel.add(leftPanel);
 centerPanel.add(optionsPanel);
  centerPanel.add(rightPanel);
 
 this.add(titlePanel, BorderLayout.NORTH);
 this.add(centerPanel, BorderLayout.CENTER);
 this.add(buildPanel, BorderLayout.SOUTH);

 
 //adds action listeners
	b.addActionListener(this);
	vitaminMenu.addActionListener(this);
	mineralMenu.addActionListener(this);
    buildButton.addActionListener(this);
	buildMineralButton.addActionListener(this);
	reset.addActionListener(this);
 
 
 
 
	}
//gets the vitamins of a certain food
 
	public static String getVitamin(String [][] theArray, String [] secondArray, String theSearchItem){
		String result = "";
		theSearchItem = convert(theSearchItem);
		for(int i =0; i < theArray.length; i++){
			for(int c =0; c < theArray[i].length;c++){
				String test = String.valueOf(theArray[i][c]);
				if(test.equals(theSearchItem)){
					int index = 0;
					index = i;
					result = result + "\n" + secondArray[i];
				}
			}
			
				

		}
		return result;
	}
 
 
 
 
 
 // gets the foods matching the search item food
 	public static String sequentialSearchVitaminFood(String [][] theArray, String theSearchItem){
		//String result = theSearchItem + " Not Found!";
		theSearchItem = convert(theSearchItem);
		String result ="";
		int count = 0;
		for(int i =0; i < theArray.length; i++){
			for(int c =0; c < theArray[i].length;c++){
				String test = String.valueOf(theArray[i][c]);
				if(test.equals(theSearchItem)){
					//result = String.valueOf(theSearchItem);
					count++;
					
				}
				
			}
			
				

		}
		result = theSearchItem + " was found " + String.valueOf(count) + " time(s) in Vitamins\n";
		return result;
	}
	
	
	//return true if a food that matches the searched for food is found in vitamin group
	public static boolean boolSearchVitamin(String [][] theArray, String theSearchItem){
		//String result = theSearchItem + " Not Found!";
		theSearchItem = convert(theSearchItem);
		boolean result = false;
		for(int i =0; i < theArray.length; i++){
			for(int c =0; c < theArray[i].length;c++){
				String test = String.valueOf(theArray[i][c]);
				if(test.equals(theSearchItem)){
					result = true;
					return result;
					
				}
				
			}
			
				

		}
		return result;
	}
	
	
	
	
	//searches mineral array for food containing search item food
	
		public static String sequentialSearchMineralFood(String [][] theArray, String theSearchItem){
		//String result = theSearchItem + " Not Found!";
		theSearchItem = convert(theSearchItem);
		String result ="";
		int count = 0;
		for(int i =0; i < theArray.length; i++){
			for(int c =0; c < theArray[i].length;c++){
				String test = String.valueOf(theArray[i][c]);
				if(test.equals(theSearchItem)){
					//result = String.valueOf(theSearchItem);
					count++;
					
				}
				
			}
			
				

		}
		result = theSearchItem + " was found " + String.valueOf(count) + " time(s) in Minerals\n";
		return result;
	}
	
		//return true if a food that matches the searched for food is found in mineral group
		public static boolean boolSearchMineral(String [][] theArray, String theSearchItem){
		//String result = theSearchItem + " Not Found!";
		theSearchItem = convert(theSearchItem);
		boolean result = false;
		for(int i =0; i < theArray.length; i++){
			for(int c =0; c < theArray[i].length;c++){
				String test = String.valueOf(theArray[i][c]);
				if(test.equals(theSearchItem)){
					result = true;
					return result;
					
				}
				
			}
			
				

		}
		return result;
	}
 //converts search item from processed foods to Processed Foods
 public static String convert(String val){
	 char[] ch = val.toCharArray();
	 ch[0] = Character.toUpperCase(ch[0]);
	 for (int i = 1; i < ch.length; i++){
		 if(Character.isWhitespace(ch[i - 1])){
			 ch[i] = Character.toUpperCase(ch[i]);
		 }
	 }
	 return new String(ch);
 }
 
 
 
 @Override
public void actionPerformed(ActionEvent e){
	
	
	
	
	
	//checks food for food search item inside vitamins
	String s = e.getActionCommand();
	if (s.equals("submit")){
		String searchItemVit = "";
		searchItemVit = t.getText();
		boolean isThereItemVit = boolSearchVitamin(rda, searchItemVit);
		String foundVit = sequentialSearchVitaminFood(rda, searchItemVit);
		
		//checks food for food search item inside minerals
		String searchItemMin = "";
		searchItemMin = t.getText();
		boolean isThereItemMin = boolSearchMineral(rdam, searchItemMin);
		String foundMin = sequentialSearchMineralFood(rdam, searchItemMin);
		
		


		
		
		//finds vitamins inside found food search item
		foundItem.setText("");
		foundItem.append(foundVit + "\n");
		if(isThereItemVit == true){
			String vitamin = getVitamin(rda, vitaminList, searchItemVit);
			foundItem.append(convert(searchItemVit) + " contains these Vitamins: \n");
			foundItem.append(vitamin + "\n");
		}

		
		
		//finds minerals inside found food search item
		foundItem.append("\n");
		foundItem.append(foundMin + "\n");
		if(isThereItemMin == true){
			String mineral = getVitamin(rdam, mineralList, searchItemMin);
			foundItem.append(convert(searchItemVit) + " contains these Minerals: \n");
			foundItem.append(mineral + "\n");
		}
		t.setText("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	if (e.getSource() == vitaminMenu){
      int i = vitaminMenu.getSelectedIndex();
	}
	  
	 if (e.getSource() == buildButton){
		 buildText.setText("");
	buildText.append("Vitamin: " + String.valueOf(vitaminMenu.getSelectedItem()) + "\n");
	
		int i = vitaminMenu.getSelectedIndex();
			buildText.append("RDA = Recommended Daily Amount \n");
			buildText.append(rda [i][0] + "\n" + rda [i][1] + "\n");
			buildText.append("Good Food Sources include: \n");
		for(int c =2; c <rda[i].length; c++){
	
			buildText.append(rda[i][c] + "\n");
		}
	 }
	
	
	
	
	
	
	//
	//
	//
	//
	//
	//
	//
	//
	//
	
	
	
	//outputs information pertaining to the selected Mineral
	


	 
	 
	  if (e.getSource() == buildMineralButton){
		 buildMineralText.setText("");
	buildMineralText.append("Mineral: " + String.valueOf(mineralMenu.getSelectedItem()) + "\n");
	 
	 
	 int i = mineralMenu.getSelectedIndex();
			buildMineralText.append("RDA = Recommended Daily Amount \n");
			buildMineralText.append(rdam [i][0] + "\n" + rdam [i][1] + "\n");
			buildMineralText.append("Good Food Sources include: \n");
		for(int c =2; c <rda[i].length; c++){
	
			buildMineralText.append(rdam[i][c] + "\n");
		}
	 }
	 

	 
	 //checks for reset button press
	   if (e.getSource() == reset){
		   buildMineralText.setText("");
		   buildText.setText("");
		   foundItem.setText("");
		   t.setText("");
		   buildMineralText.setText("Choose a Mineral and see info!");
		   buildText.setText("Choose a Vitamin and see info!");
	   }
	   
	   
}

}
 
	
	