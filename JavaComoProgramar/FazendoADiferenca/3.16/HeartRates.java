import java.util.Calendar;

public class HeartRates {
	
	String nome;
	String sobrenome;
	String dtNasc;
	int dia;
	int mes;
	int ano;

	public HeartRates() {}

	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return nome;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public int getIdadeEmAnos(int dia, int mes, int ano) {
	    Calendar dob = Calendar.getInstance();
	    Calendar today = Calendar.getInstance();

	    dob.set(ano, mes, dia); 

	    int idade = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

	    if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)){
	        idade--; 
	    }

	    return idade;


	    /*Integer ageInt = new Integer(idade);
	    String ageS = ageInt.toString();

	    return ageS;*/  
	}	

	public int getFrequenciaBase(int idade) {
		//int idade = getIdadeEmAnos();
		return 220 - idade;
	}

	public int getFrequenciaMinima(int idade) {
		return (220 -idade) * 50 / 100;
	}

	public int getFrequenciaMaxima(int idade) {
		return (220 - idade) * 85 / 100;
	}

}