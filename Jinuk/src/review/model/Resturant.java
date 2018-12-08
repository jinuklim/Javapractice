package review.model;


	import javafx.beans.property.SimpleStringProperty;
	import javafx.beans.property.StringProperty;

	public class Resturant {

		private final StringProperty Name;
		private final StringProperty Addition;
		private final StringProperty Write;



//		디폴트 생성자


		public Resturant (String string){
			this.Name = new SimpleStringProperty("Name");
			this.Addition = new SimpleStringProperty("Addition");
			this.Write = new SimpleStringProperty("abc");


			}

		public String getName() {
			return Name.get();
		}

		public void setName(String Name){
			this.Name.set(Name);
		}

		public StringProperty NameProperty() {
			return Name;
		}

		public String getAddition() {
			return Addition.get();
		}

		public void setAddition(String Addition){
			this.Addition.set(Addition);;
		}
		public StringProperty Additiona() {
			return Addition;
		}
		public String getWrite() {
			return Write.get();
		}
		public void setWrite(String Write){
			this.Write.set(Write);
		}
		public StringProperty WriteProperty(){
			return Write;
		}





	}


