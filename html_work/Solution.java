class Solution {
  public static void main(String[] args) {
    int a = 10;
    System.out.println(a++);
    System.out.println(++a);

    System.out.println(--a);
    System.out.println(a--);
    // int[] result = solution("EESEEWNWSNWWNS");
    // System.out.println(result[0]);
    // System.out.println(result[1]);
  }
  public static int[] solution(String route) {
    int east = 0;
    int north = 0;
    int[] answer = new int[2];
    for (int i = 0; i < route.length(); i++) {
      switch (route.charAt(i)) {
        case 'N':
          north++;
          break;
        case 'S':
          --north;
          break;
        case 'E':
          east++;
          break;
        case 'W':
          --east;
          break;
      }
    }
    answer[0] = east;
    answer[1] = north;
    return answer;
  }
}