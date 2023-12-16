import Data.MenuData

class Controller {
    val setmenu = MenuData()                        // 데이터클래스 데이터 처리에 사용할 객체 선언
    fun setData() { setmenu.add() }                 // 데이터클래스에 메뉴 데이터 집어넣기
    private val cart = Cart()                       // 장바구니 객체 선언

    fun promptMain() {                                    // 메인화면 출력하고 while(true)로 Exception 발생하거나 "q"를 입력받기 전까지
        var choice = Prompt().mainmenu(setmenu, cart)     // 루프 돌리며 화면 출력
        while (true){
            when (choice) {
                "1" -> choice = Prompt().promptMenu(setmenu.menu.getSpecial(), cart)     // 메인화면에서 1번 입력받으면 스페셜 피자 메뉴 화면으로
                "2" -> choice = Prompt().promptMenu(setmenu.menu.getPremium(), cart)     // 메인화면에서 2번 입력받으면 프리미엄 피자 메뉴 화면으로
                "3" -> choice = Prompt().promptMenu(setmenu.menu.getOriginal(), cart)    // 메인화면에서 3번 입력받으면 오리지널 피자 메뉴 화면으로
                "4" -> choice = Prompt().promptMenu(setmenu.menu.getSides(), cart)       // 메인화면에서 4번 입력받으면 사이드 메뉴 화면으로
                "5" -> choice = Prompt().promptMenu(setmenu.menu.getBeverage(), cart)    // 메인화면에서 5번 입력받으면 음료 메뉴 화면으로
                "p" -> choice = Prompt().order(cart)                                     // 메인화면에서 "p" 입력받으면 주문확인 화면으로
                "q" -> {                                // 메인화면에서 "q" 입력받으면 Exception으로 프로그램 종료
                    throw Exception("주문을 종료합니다")
                }
                "r" -> choice = Prompt().removeItem(cart)           // "r" 입력받으면 주문 수정 화면으로
                else -> choice = Prompt().mainmenu(setmenu, cart)   // 지정한 입력값이 아니면 메인화면으로
            }
        }
    }
}