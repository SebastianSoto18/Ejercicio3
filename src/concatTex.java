public class concatTex {
    public static void main(String[] args){
        String[] tex = {"palabra1","palabra2","palabra3","palabra4","palabra5"};
        String texConcat = "";

        for(String word: tex){
            texConcat += word;
        }

        System.out.println(texConcat);
    }

}
