package test.property;

import main.property.AcquisitionType;
import main.property.PropertyType;
import main.property.StructureType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTypeTest {
    @Test
    void onlyOneSaleHouse() {
        PropertyType saleHouse1 = PropertyType.get(AcquisitionType.SALE, StructureType.HOUSE);
        PropertyType saleHouse2 = PropertyType.get(AcquisitionType.SALE, StructureType.HOUSE);
        assertTrue(saleHouse1 == saleHouse2);
    }
}