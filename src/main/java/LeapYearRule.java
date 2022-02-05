public class LeapYearRule implements Rule {

    @Override
    public String checkFizzBuzz(int number) {
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            return "うるう年です";
        }
        return "";
    }
}
