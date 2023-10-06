package Problem_2.service;

import Problem_2.Interfaz.ILocal;
import Problem_2.dto.LocalDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalServicelmpl implements ILocal {
    private List<LocalDTO> locals;

    public LocalServicelmpl() throws IOException, ClassNotFoundException {
        locals = new ArrayList<>();
    }

    @Override
    public LocalDTO findById(int id) {
        return locals.stream()
                .filter(local -> local.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<LocalDTO> findAll() throws IOException, ClassNotFoundException {
        locals = (List<LocalDTO>) ObjectSerializer.readObjectFromFile("locals.ax");
        return locals;
    }

    @Override
    public void save(LocalDTO local) throws IOException {
        locals.add(local);
        ObjectSerializer.writeObjectToFile(locals, "locals.ax");
    }

    @Override
    public void update(LocalDTO local) throws IOException {
        LocalDTO  oldLocal = findById(local.getId());
        if (oldLocal != null) {
            locals.remove(oldLocal);
            locals.add(local);
            ObjectSerializer.writeObjectToFile(locals, "locals.ax");
        }
    }

    @Override
    public void delete(LocalDTO local) throws IOException {
        locals.remove(local);
        ObjectSerializer.writeObjectToFile(locals, "locals.ax");
    }
}
