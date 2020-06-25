package OCA2020Modify223qNewQuestions;

public class Q120 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(3);
        sb.append(3);
        sb.append(4);
        //   sb.deleteAll(); boyle bir method yok
        //   sb.remove(); boyle bir method yok
        //   sb.delete(0,sb.size()); size stringbuilder de yok length() var
        sb.delete(0,sb.length());
        System.out.println(sb.toString());

    }
}
