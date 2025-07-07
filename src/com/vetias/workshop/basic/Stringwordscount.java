public class Stringwordscount {
    public static void main(String[] args) {
        String text= "This program showshow can we split a"+ "string into multiple strings. We need to find sentence,"+"word and letter count";
        String[] sentences = text.split("[.]");
        String[] words = text.split(" ");
        String[] chr = text.split("");
        System.out.println("Number of sentences: " + sentences.length);
        System.out.println("Number of words: " + words.length);
        System.out.println("Number of characters:"+text.length());
        System.out.println("Number of characters: " + chr.length); 
        
       

        
    
}
}

    


        
    
    

