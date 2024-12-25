package creating_node;

public class Main1 {
    public static void main(String[] args) {
        Class1 A = new Class1();
        Class1 B = new Class1();  //bellekte düğüm oluşturduk.
        Class1 C = new Class1();

        A.number=11;
        B.number=12;
        C.number=13;  //düğümlere değerlerini atıyoruz.

        A.next=B;
        B.next=C;
        C.next=null;  //düğümleri birbirine bağladık

        Class1 temp=A;

        while (temp!=null) { //düğümlerin üzerinde dolaştık.
            System.out.println(temp.number);
            temp=temp.next;
        }
    }
}
