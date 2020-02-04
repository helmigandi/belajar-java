import java.util.Scanner;


class sameString{
	public static void main (String[] args){
		Scanner str = new Scanner(System.in);
		String kalimat = str.nextLine();
		String[] words = kalimat.split("\\W+");

		for(int i=0; i<words.length; i++){
			int count = 0; // reset the counter for each word
			for(int j=0; j<words.length; j++){
				if(words[i].equals(words[j])){
					 /* if the words are the same, but j < i, it was already calculated
               and printed earlier, so we can stop checking the current word
               and move on to another one */
					if(j < i){
						break; // exit the inner loop, continue with the outer one
					}
					count++;
				}
			}
			if (count > 1) {
        		System.out.println("the word " + words[i] + " occured " + count + " time");
    		}
		}
	}
}
// https://stackoverflow.com/questions/32798271/find-the-duplicate-word-from-a-sentence-with-count-using-for-loop