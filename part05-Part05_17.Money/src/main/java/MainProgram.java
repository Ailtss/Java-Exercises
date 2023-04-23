
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        
        Money a = new Money(10,0);
        Money b = new Money(5,0);
        
        Money c = a.plus(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println("");
        System.out.println("");
        
        a = a.plus(c);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Testing method lessThan");
        
        System.out.println("Testando a e b: " + a.lessThan(b));
        System.out.println("Testando b e c: " + b.lessThan(c));
        
        
        Money d = new Money(10,99);
        Money e = new Money(10,98);
        Money f = new Money(10,98);
        
        System.out.println("Testando d e 'e': " + d.lessThan(e));
        System.out.println("Testando 'e' e d: " + e.lessThan(d));
        System.out.println("Testando 'e' e f: " + e.lessThan(f));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Testando método minus");
        System.out.println("");
        
        Money g = new Money(10, 0);
        Money h = new Money(7, 50);
        Money i = new Money(9, 0);
        Money j = new Money(0, 50);
        Money l = new Money(0, 30);
        
        System.out.println("Testando g e h: " + g.minus(h));
        System.out.println("Testando h e i: " + h.minus(i));
        System.out.println("Testando g e i: " + g.minus(i));
        System.out.println("Testando j e l: " + j.minus(l));
        System.out.println("Testando l e j: " + l.minus(j));
        
        
    }
}
