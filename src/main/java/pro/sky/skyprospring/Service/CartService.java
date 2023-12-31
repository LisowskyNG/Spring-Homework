package pro.sky.skyprospring.Service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Service

public class CartService {
    private final Set<Integer> items;

    public CartService(Set<Integer> items) {
        this.items = items;
    }

    public void add(Set<Integer> ids) {
        items.addAll(ids);
    }
    public Set<Integer> get() {
        return Collections.unmodifiableSet(items);
    }


}
