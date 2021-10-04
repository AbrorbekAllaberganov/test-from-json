package uz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hakaton {
    private Integer id;
    private String category;
    private String title;

    @Override
    public String toString() {
        return  "id=" + id +"\n"+
                "category='" + category + '\n' +
                "title='" + title
                ;
    }
}
