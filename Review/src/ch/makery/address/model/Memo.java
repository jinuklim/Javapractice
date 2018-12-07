package ch.makery.address.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Memo {

	private final StringProperty Name;
	private final StringProperty Additionalexplanation;
	private final StringProperty Write;



//	디폴트 생성자

	public Memo (){
		this(null);
	}


	public Memo(String Name){
		this.Name = new SimpleStringProperty(Name);


		this.Additionalexplanation = new SimpleStringProperty("Additionalexplanation");
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

	public String getAdditionalexplanation() {
		return Additionalexplanation.get();
	}

	public void setAdditionalexplanation(String Additionalexplanation){
		this.Additionalexplanation.set(Additionalexplanation);;
	}
	public StringProperty Additionalexplanation() {
		return Additionalexplanation;
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
