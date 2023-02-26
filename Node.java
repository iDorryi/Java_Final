package First_way;
class Node {

    private int x;
    private int y;
    private int value;
    
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Node(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getValue() {
        return this.value;
    }
    
    // public void setValue(int value) {
    //     this.value = value;
    // }
    
    public boolean equals(Node n) {
        if (this.x == n.x && this.y == n.y) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return this.x + " " + this.y;
      }
    }
//   На выходе получаем O - это препятствие, 0 это пути 
