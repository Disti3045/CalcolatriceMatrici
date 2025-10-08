public class matrice {
	float[][] contenuto;
	int righe;
	int colonne;
	
	public matrice(String input) {
        this.contenuto = parseMatrix(input);
        this.righe = contenuto.length;
        this.colonne = (righe > 0) ? contenuto[0].length : 0;
    }
	
    private float[][] parseMatrix(String input) {
        String[] righeTesto = input.trim().split("\\n+|;");
        float[][] matriceTemp = new float[righeTesto.length][];
        for (int i = 0; i < righeTesto.length; i++) {
            String[] elementi = righeTesto[i].trim().split("\\s+");
            matriceTemp[i] = new float[elementi.length];
            for (int j = 0; j < elementi.length; j++) {
                String elem = elementi[j].trim();
                try {
                    if (elem.contains("/")) {
                        String[] parti = elem.split("/");
                        float numeratore = Float.parseFloat(parti[0]);
                        float denominatore = Float.parseFloat(parti[1]);
                        matriceTemp[i][j] = numeratore / denominatore;
                    } else {
                        matriceTemp[i][j] = Float.parseFloat(elem);
                    }
                } catch (Exception e) {
                    System.err.println("Elemento non valido: " + elem + " → impostato a 0");
                    matriceTemp[i][j] = 0;
                }
            }
        }
        return matriceTemp;
    }
    
    public boolean isQuadrata() {
        return righe == colonne;
    }
    
    public float[][] getMatrice() {
        return contenuto;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (float[] riga : contenuto) {
            for (float val : riga) {
                sb.append(String.format("%-6.2f", val)).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
}
