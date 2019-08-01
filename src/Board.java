import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Board {
	
	private int[][] position;
	
	public Board() {
		displayBoard();
	}
	
	public void displayBoard() {
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(new File("Board.txt")));
			
			//for first line
			String first = buffer.readLine();
			String[] line = first.split(" ");
			int x =Integer.valueOf(line[0]) ;
			int y = Integer.valueOf(line[1]) ;
			position= new int[x][y]; 
			
			//board
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		
	}
}
