import Data.Menu
import Data.MenuData

class Prompt {
    fun mainmenu(setmenu: MenuData, cart : Cart) : String {                // 메인 화면
        val menuSet = setmenu.menu.getMenu()                               // menuSet으로 카테고리 메뉴 가져옴

        println("주문하실 메뉴를 선택해주세요")
        for (i in 1..menuSet.size) {                                 // 카테고리 메뉴 Set을 for 루프로 번호와 함께 출력
            println("$i. ${menuSet.elementAt(i - 1)}")
        }
        println("p: 계산   r: 주문 수정하기   q: 종료   아무 키 입력: 메인 화면")
        println(cart)

        val choice : String = readln()                                     // 사용자 입력을 받아 controller에 리턴
        return choice
    }

    fun promptMenu(list : List<Menu>, cart : Cart) : String {                       // 메뉴 종류 리스트와 장바구니 객체를 인자로 받음
        println("주문하실 메뉴를 선택해주세요")
        for (i in 1..list.size) {                                             // for 루프로 해당 메뉴 리스트에 있는 항목들을
            println("$i. ${list[i-1].component2()} : ${list[i-1].component4()}원")   // 메뉴 번호. 메뉴 이름 : 가격
            println("                        - ${list[i-1].component3()}")          //                메뉴 설명  형식으로 출력함
        }
        println("p: 계산   r: 주문 수정하기   q: 종료   아무 키 입력: 메인 화면")
        println(cart)
        val choice : String = readln()
        when (choice) {
            "p" -> return "p"                                  // 입력에 대해 반환 - Controller.promptMain 에서 처리
            "q" -> return "q"                                  // choice를 숫자로 변환하기 전에 지정한 문자 먼저 처리
            "r" -> return "r"
            "" -> return "mainmenu"
        }
        try{choice.toInt()}                             // choice를 Int index 로 사용하기 전 숫자 형식이 아니면
        catch(e: NumberFormatException) {               // try-catch로 예외 처리. "mainmenu" 반환해 메인메뉴 화면으로 보냄
            println("올바른 입력이 아닙니다")
            return "mainmenu" }

        if (choice.toInt() in IntRange(1, list.size)) {      // 입력받은 값이 출력한 메뉴의 인덱스와 같으면
            cart.addCart(list[choice.toInt() - 1])           // 해당 메뉴를 장바구니 객체에 addCart(Menu)로 추가
        } else {
            println("올바른 입력이 아닙니다.")                    // 출력한 메뉴의 인덱스와 같지 않으면
            return "mainmenu"                               // print문 출력하고 메인메뉴 화면으로 보냄
        }
        return "mainmenu"
    }

    fun removeItem(cart: Cart) : String {                   // 장바구니 리스트를 출력하고 입력에 맞는 메뉴를 삭제하는 함수
        println(cart)
        println("삭제할 항목의 번호를 입력해주세요")
        println("p: 계산  q: 종료   아무 키 입력: 메인 화면")

        val removeInput: String = readln()
        when (removeInput) {                                // 계산, 종료, 메인화면 이동 문자열 먼저 처리
            "p" -> return "p"
            "q" -> return "q"
            "" -> return "mainmenu"
        }

        try{removeInput.toInt()}                            // 숫자 형식이 아니면 예외로 처리
        catch(e: NumberFormatException) {
            println("올바른 입력이 아닙니다")
            return "mainmenu"
        }

        if (removeInput.toInt() in IntRange(1, cart.orderList.size)) {
            println("${cart.orderList.elementAt(removeInput.toInt() - 1).component2()}(이)가 삭제되었습니다.\n")
            cart.orderList.removeAt(removeInput.toInt() - 1)
        } else {                                                      // 사용자 입력이 출력한 메뉴 번호와 같으면 메세지 출력하고
            println("올바른 입력이 아닙니다.")                              // 장바구니에서 삭제.
            return "mainmenu"                                         // 출력한 메뉴 번호와 다르면 메세지 출력하고 메인화면으로 보냄
        }
        return "mainmenu"
    }

    fun order(cart: Cart) : String {   // 계산 화면 출력, 주문서 리스트 받아서 출력
        if (cart.getSum() == 0) {                                   // 장바구니의 주문금액 총합이 0이면 메뉴가 비어있다는 뜻으로
            println("선택된 항목이 없습니다\n"); return "mainmenu"        // 메세지 출력하고 메인화면으로 보냄
        }
        println(cart)
        println("[ 주문 금액 ]")
        println("${cart.getSum()} 원")       // Cart 클래스의 getSum()함수로 주문금액 총합 출력
        println("위와 같이 주문 하시겠습니까?")
        println("1. 계산하기        2. 주문 추가하기        3. 종료하기")

        val orderInput: String = readln()
        try{orderInput.toInt()}
        catch(e: NumberFormatException) {
            println("올바른 입력이 아닙니다")                 // 올바른 입력이 아니면 "p"를 리턴해 계산 화면 다시 출력
            return "p"
        }

        when (orderInput) {
            "1" -> {println("${cart.getSum()} 원을 결제해주세요."); throw Exception("주문이 완료되었습니다.")}
            "2" -> return "mainmenu"                                // 1번 계산하기 입력되면 금액 출력하고 throw Exception 으로 종료
            "3" -> {                                                // 2번 주문 추가하기 입력되면 메인화면 출력
                throw Exception("주문을 종료합니다")                    // 3번 종료하기 입력되면 throw Exception으로 종료
            }
            else -> return "p"                                     // 나머지 입력값은 계산 화면 다시 출력
        }
    }
}