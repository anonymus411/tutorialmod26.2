/*
Farmers Delight Cutting Board
An important thing to note is that if you are passing in a sound parameter, which is Optional, you need to specify the FULL Identifier:
`"minecraft:block.gravel.break"` is the same as `"block.gravel.break"` since the default MOD_ID is `minecraft`, but if you want to reference custom or modded sounds, you'll need to specify the MOD_ID.
The weight of the outputs is relative. As you might be able to test by using the default recipes, an IItemStack of stacksize 2 with a 50% chance is not the same as two different stacks with two different changes.
Sometimes you'll get 0 stacks, sometimes you'll get 1 and sometimes 2. That's the currently defined chance in the "wool_to_string" recipe.
You can also use a <toolaction> as a tool! You can get the list of valid tool actions using the /ct dump toolactions command.
*/

<recipetype:tutorialmod:cutting>.addRecipe("cutting_board_test", <item:minecraft:gravel>, [<item:minecraft:flint>], <item:minecraft:string>, "minecraft:block.gravel.break");

<recipetype:tutorialmod:cutting>.addRecipe("tool_action_example", <item:minecraft:jack_o_lantern>, [<item:minecraft:torch>, <item:tutorialmod:pumpkin_slice> * 3 % 60], <toolaction:shears_carve>, "block.pumpkin.carve");

<recipetype:tutorialmod:cutting>.addRecipe("wool_to_string", <tag:items:minecraft:wool>, [(<item:minecraft:string> * 2) % 50], <item:minecraft:shears>);

<recipetype:tutorialmod:cutting>.remove(<item:minecraft:leather>);


