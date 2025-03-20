package Bai03;

import org.json.JSONObject;

public class XMLToJsonAdapter extends JsonSystemNew {
    private XMLSystemOld xmlSystem;

    public XMLToJsonAdapter(XMLSystemOld xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public void saveJson(String data) {
        // Chuyển đổi XML thành JSON
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", data);

        // Lưu dữ liệu vào hệ thống JSON mới
        super.saveJson(jsonObject.toString());
    }

    // Phương thức thêm để xử lý XML
    public void saveXML(String data) {
        xmlSystem.saveXML(data);
    }
}
