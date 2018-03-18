package shokoban;



public class Tile extends TileElement {
	public void Remove(Object o) {
      
        System.out.println(">");
        System.out.println("  ");
        System.out.println("[:Tile].Remove(o):");

        //f�ggv�ny t�rzs
        setObject(null);

        //visszat�r�nk a f�ggv�nyb�l
        System.out.println("<");
        System.out.println("  ");
        System.out.println("[:Tile].Remove(o):");
    }

	@Override
	public void Accept(Object o, Direction d) {
		
		System.out.println(">");
        System.out.println("  ");
        System.out.println("[:Tile].Accept(o,d):");

        //f�ggv�ny t�rzs
        if(!this.getObject().equals(null))
			o.push(o, d);
		
		o.visit(this, d);

        //visszat�r�nk a f�ggv�nyb�l
        System.out.println("<");
        System.out.println("  ");
        System.out.println("[:Tile].Accept(o,d):");
		
	}

}

