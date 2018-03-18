package shokoban;

public abstract class TileElement {

    private TileElement neighbours; //ennek vmi tárolónak kéne lennie
    private Object object;

    public abstract void Accept (Object o, Direction d);

    public void Remove(Object o) {
        //bemegyünk a fgv-be
        System.out.println(">");
        System.out.println("  ");
        System.out.println("[:TileElement].Remove(o):");

        //fgv törzs
        setObject(null);

        //visszatérünk a fgv-ből
        System.out.println("<");
        System.out.println("  ");
        System.out.println("[:TileElement].Remove(o):");
    }

    public TileElement getNeighbour(Direction d) {
        //bemegyünk a fgv-be
        System.out.println(">");
        System.out.println("  ");
        System.out.println("[:TileElement].getNeighbour(d):");

        //visszatérünk a fgv-ből
        System.out.println("<");
        System.out.println("  ");
        System.out.println("[:TileElement].getNeighbour(d):");
        
        return neighbours; // ez nem jó, mert csak 
    }

    public Object getObject() {
        //bemegyünk a fgv-be
        System.out.println(">");
        System.out.println("  ");
        System.out.println("[:TileElement].getObject():");
        
        //visszatérünk a fgv-ből
        System.out.println("<");
        System.out.println("  ");
        System.out.println("[:TileElement].getObject():");
        
        return object;
    }

    public void setObject(Object object) {
        //bemegyünk a fgv-be
        System.out.println(">");
        System.out.println("  ");
        System.out.println("[:TileElement].setObject(object):");

        this.object = object;

        //visszatérünk a fgv-ből
        System.out.println("<");
        System.out.println("  ");
        System.out.println("[:TileElement].setObject(object):");
    }

}
