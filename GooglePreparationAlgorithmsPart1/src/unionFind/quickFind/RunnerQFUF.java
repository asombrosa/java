package unionFind.quickFind;

public class RunnerQFUF {
    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.union(4, 3);
        quickFindUF.union(3, 8);
        quickFindUF.union(6, 5);
        quickFindUF.union(9, 4);
        quickFindUF.union(2, 1);
        System.out.println(quickFindUF.connected(0, 7));
        System.out.println(quickFindUF.connected(8, 9));
        quickFindUF.union(5, 0);
        quickFindUF.union(7, 2);
        quickFindUF.union(6, 1);
        quickFindUF.union(1, 0);
        System.out.println(quickFindUF.connected(0, 7));
    }
}
