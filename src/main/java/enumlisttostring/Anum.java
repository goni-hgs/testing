package enumlisttostring;

/**
 * @Author : Goni of Berlin 
 * @Date   : 12/23/15
 */
public enum Anum {
	A("name", "code"),
	B("name2", "code2");

	private String name;
	private String code;

	Anum(String name, String code) {
		this.name = name;
		this.code = code;
	}

}
