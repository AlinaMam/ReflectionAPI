package Zadacha_28_2_2;

public class Picture implements Deletable {
    @Override
    public void delete(String articleId) {
        System.out.println("Pictures is deleted");
    }
}
