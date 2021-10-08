package com.zelwina.rulez.domain.record;

import java.util.List;
import java.util.function.Predicate;

public record ReteNode<F extends Fact>(
        List<ReteNode<F>> leaves,
        Predicate<F> predicate
) {

    public boolean isFinal(){
        return leaves == null || leaves.isEmpty();
    }

    public List<ReteNode<F>> findNextRules(final F fact){
        if(isFinal()){
            return List.of();
        } else {
            return leaves.stream()
                    .filter(fReteNode -> fReteNode.predicate.test(fact))
                    .toList();
        }
    }
}
