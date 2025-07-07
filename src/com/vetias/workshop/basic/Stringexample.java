public class Stringexample {

    public static void main(String[] args) {
        String FirstName = "nivetha";
        String LastName = "jayaganesan";
        String FinalName = FirstName.concat(LastName);
        System.out.println("Concatenated String: " + FinalName);
        String UpperCase = FinalName.toUpperCase();
        System.out.println("Uppercase String: " +UpperCase);


        String sentence = "this program shows how can we split a string into multiple string";
        String words[] = sentence.split("");
        System.out.println(words.length);

        
        
}
}
    
