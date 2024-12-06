package vn.compedia.soapwebservice.repositories;

import com.baeldung.springsoap.gen.Country;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // Khởi tạo dữ liệu quốc gia
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
