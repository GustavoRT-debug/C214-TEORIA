import org.json.*;

public class ProfessorHorarioAtendimento {
    public void popularPagina(String jsonString) {
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            String professor = jsonObject.getString("professor");
            String horario = jsonObject.getString("horario");
            int periodo = jsonObject.getInt("periodo");
            int sala = jsonObject.getInt("sala");
            int predio = jsonObject.getInt("predio");
            
        } catch (JSONException e) {
            System.out.println("Erro ao analisar o JSON: " + e.getMessage());
        }
    }
}