package lv.eleonora.figure;

public class Rectangle {

		private float length = 1.0f;
		private float width = 1.0f;
		
		public Rectangle(){
			this.length = 0;
			this.width = 0;
		}

		public Rectangle(float length, float width) {
			this.length = length;
			this.width = width;
		}

		public float getLength() {
			return length;
		}

		public void setLength(float length) {
			this.length = length;
		}

		public float getWidth() {
			return width;
		}

		public void setWidth(float width) {
			this.width = width;
		}
		
		public String toString(){
			return "Length: "+this.length+" Width: "+this.width;
		}
		
	}
