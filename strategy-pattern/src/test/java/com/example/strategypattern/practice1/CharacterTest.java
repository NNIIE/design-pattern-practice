package com.example.strategypattern.practice1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterTest {

    @Test
    void attackTest() {
        Character character = new Character();
        Knife knife = new Knife();
        Sword sword = new Sword();

        character.weapon(sword);
        assertThat(character.attack()).isEqualTo("검");
    }

}