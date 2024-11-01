package Project4;

public class Plot {
	  private int width;
	     private int depth;
	        private int x;
	        private int y;

	        public Plot() {
	          this(0,0,1,1);  
	        }



	      public Plot (int x, int y, int width, int depth) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.depth = depth;
	      }
	        public Plot(Plot other) {
	      this(other.x, other.y, other.width, other.depth);
	    }

	      public int getWidth() {
	        return width;
	      }
	      public int getDepth() {
	        return depth;
	      }
	      public int getX() {
	        return x;
	      }
	      public int getY() {
	        return y; 
	      }
	  public void setWidth(int width) {
	    this.width = width;
	  }

	  public void setDepth(int depth) {
	    this.depth = depth;
	  }

	  public void setX(int x) {
	    this.x = x;
	  }

	  public void setY(int y) {
	    this.y = y;
	  }

	       
	      public boolean overlaps(Plot other) {
	       if (!(other.x >= this.x + this.width || 
	           other.x + other.width <= this.x || 
	           other.y >= this.y + this.depth || 
	           other.y + other.depth <= this.y)) {
	         return true;
	           }
	         return false;
	      }
	        public boolean encompasses(Plot other) {
	      if (other.x >= this.x &&
	               other.y >= this.y &&
	               other.x + other.width <= this.x + this.width &&
	               other.y + other.depth <= this.y + this.depth) {
	        return true;
	        } else {
	        return false;
	        }
	        }
	      public String toString() {
	          return x + "," + y + "," + width + "," + depth;
	      }
	  }
