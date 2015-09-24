package yanfeishao.cs555.utils;

import lombok.Data;
import yanfeishao.cs555.entities.FamilyEntity;
import yanfeishao.cs555.entities.PersonEntity;
import yanfeishao.cs555.enums.ParseEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yanfei Shao on 2015.
 */
@Data
public class SimpleDBUtils {

    private Map<String, PersonEntity> personDB;
    private Map<String, FamilyEntity> familyDB;

    /**
     * Instantiates a new Simple dB utils.
     */
    public SimpleDBUtils() {
        personDB = new HashMap<>();
        familyDB = new HashMap<>();
    }

    public List<FamilyEntity> getFamilyDBList() {
        List<FamilyEntity> familyEntities = new ArrayList<>();
        for (int index = 1; index <= getFamilyDB().size(); index++) {
            familyEntities.add(getFamilyDB().get(ParseEnum.FAMILY_PREFIX.toString() + index + ParseEnum.PREFIX.toString()));
        }
        return familyEntities;
    }

    public List<PersonEntity> getPersonDBList() {
        List<PersonEntity> personEntities = new ArrayList<>();
        for (int index = 1; index <= getPersonDB().size(); index++) {
            personEntities.add(getPersonDB().get(ParseEnum.PERSON_PREFIX.toString() + index + ParseEnum.PREFIX.toString()));
        }
        return personEntities;
    }

}
