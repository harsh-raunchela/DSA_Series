package Day_1.GoalParserInterpretation;

class Solution {
    public String interpret(String command) {
        command = command.replace("G", "G");
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        return command;
    }
}
