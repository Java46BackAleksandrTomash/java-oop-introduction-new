package telran.photoSelector;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhotoSelector {

			private static final String pictures[] = {
				"Paris\\20140101_090000.jpg",
				"Paris\\20140201_121005.jpg",				
				"Paris\\20150301_211035.jpg",				
				"Paris\\20150401_110023.gif",
				"Paris\\20150401_181705.jpg",				
				"Paris\\20150501_231035.gif",				
				"London\\20140205_090000.jpg",
				"London\\20140205_121005.jpg",				
				"London\\20140601_211035.gif",				
				"London\\20151001_110023.jpg",
				"London\\20151001_121705.jpg",				
				"London\\20151001_231035.jpg",
				"Chicago\\20150301_120001.png",
				"Chicago\\20151111_232000.png"
			};

			static void selectPictures(String title, String regex) {
				System.out.printf("%n%s%n------------------------%n", title);
		        Pattern pattern = Pattern.compile(regex);
		        for (String picture: pictures) {
		        	if (pattern.matcher(picture).find()) {
		        		System.out.println(picture);
		        	}
		        }
			}
			
			private static void selectCustom() {
				Scanner scanner = new Scanner(System.in);
				while(true){					
		        	System.out.printf("%n=====>Enter your regex:");
		        	String regex = scanner.nextLine();
		        	if (regex.isEmpty()) 
		        		break;
		        	selectPictures("Custom:" + regex, regex);
				}
				scanner.close();
				System.out.println("\n=====>Good bye");
			}
			
			
			public static void main(String[] args){
				
				
				//selectCustom();
				
				
				String regexTest1 = "^London";
				selectPictures("All London pictures", regexTest1);
				
				String regexTest2 = "^(Paris|London)";
				selectPictures("All Europe pictures", regexTest2);
				
				String regexTest3 = "\\d{4}(09|10|11)\\d{2}";
				selectPictures("All autumn pictures", regexTest3);
				
				String regexTest4 = "2015(03|04|05)\\d{2}";
				selectPictures("All 2015 spring pictures", regexTest4);
				
				String regexTest5 = "_(1[8-9]|2[0-4])";
				selectPictures("All night pictures", regexTest5);
				
				String regexTest6 = "^Chicago\\\\\\d{8}_(1[8-9]|2[0-4])";
				selectPictures("All night pictures from Chicago", regexTest6);
				
				String regexTest7 = "\\.(jpg|png)$";
				selectPictures("All jpg and png pictures", regexTest7);
				
				String regexTest8 = "\\d{4}(\\d\\d)\\1";
				selectPictures("All pictures taken in dates with equal number of month and day", regexTest8);
				
			}
		
	}

 
