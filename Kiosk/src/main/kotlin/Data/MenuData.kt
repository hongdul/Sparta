package Data


class MenuData {               // 데이터클래스 Data에 add함수로 Menu 객체 집어넣기
    val menu = SetMenu()
    fun add() {
        menu.addMenu(Menu("스페셜 피자", "페스티벌", "불갈비, 포테이토, 쉬림프, 핫치킨 네가지 토핑의 축제", 25900))
        menu.addMenu(Menu("스페셜 피자", "새우파티", "바다의 향이 가득한 오동통한 새우들의 파티!", 25900))
        menu.addMenu(Menu("스페셜 피자", "샘스테이크", "고급 스테이크에 로스트 버섯과 다양한 재료로 깊고 풍부한 맛을 완성!", 25900))
        menu.addMenu(Menu("스페셜 피자", "7번가스페셜", "통후라이드 새우와 고급 카나디안햄의 만남", 25900))
        menu.addMenu(Menu("스페셜 피자", "홍대피자", "불갈비, 핫치킨, 체다골드 포테이토, 새우파티를 한 판에", 25900))
        menu.addMenu(Menu("스페셜 피자", "체다골드 포테이토", "사르르 녹는 감자와 고소한 체다치즈까지 모두가 반하는 맛!", 25900))

        menu.addMenu(Menu("프리미엄 피자", "크림치즈볼", "3가지 다양한 풍미 스윗치즈, 포테이토 그리고 체다옥수수",22900 ))
        menu.addMenu(Menu("프리미엄 피자", "흥부박 포테이토", "치즈감자볼, 웨지감자, 베이컨의 삼중주", 22900))
        menu.addMenu(Menu("프리미엄 피자", "리치고구마치킨", "매콤한 불닭과 달콤한 고구마 무스의 만남!", 22900))
        menu.addMenu(Menu("프리미엄 피자", "칠리불갈비", "칠리소스와 담백한 불갈비의 만남!", 22900))
        menu.addMenu(Menu("프리미엄 피자", "고구마", "달콤한 고구마가 들어있어 계속 끌리는 마성의 고구마피자!", 22900))

        menu.addMenu(Menu("오리지널 피자", "뉴더블치즈", "고소한 모짜렐라치즈와 부드러운 허니리코타치즈", 20900))
        menu.addMenu(Menu("오리지널 피자", "체다파인애플", "파인애플, 베이컨, 체다치즈의 밸런스", 20900))
        menu.addMenu(Menu("오리지널 피자", "슈퍼콤비네이션", "신선한 재료가 빚어내는 맛의 하모니", 20900))
        menu.addMenu(Menu("오리지널 피자", "불고기", "불고기의 달콤한 육즙이 입안에 좌르륵~ 퍼져갑니다", 20900))
        menu.addMenu(Menu("오리지널 피자", "페퍼로니", "향긋한 페퍼로니와 짭조름한 치즈의 절묘한 조화", 20900))
        menu.addMenu(Menu("오리지널 피자", "고르곤졸라", "고르곤졸라 치즈와 자연산 모짜렐라 치즈가 만났다", 20900))
        menu.addMenu(Menu("오리지널 피자", "치킨할라피뇨", "매콤하게 입맛을 당기는 핫치킨과 할라피뇨의 콜라보", 20900))
        menu.addMenu(Menu("오리지널 피자", "포테이토", "고소한 웨지감자와 베이컨의 황금조합", 20900))

        menu.addMenu(Menu("사이드", "콘길리에 파스타", "매콤한 치킨에 스위트 페퍼까지 퐁당!", 7900))
        menu.addMenu(Menu("사이드", "로제 스파게티", "토마토와 크림의 두가지 매력에 베이컨과 치즈를 더하다", 8500))
        menu.addMenu(Menu("사이드", "오븐 스파게티", "특제소스와 함께 넉넉한 치즈가 일품인 오븐 스파게티", 7400))
        menu.addMenu(Menu("사이드", "치킨바샤삭", "(6조각) 급이 다른 고소함과 바삭함에 반했다!", 3900))
        menu.addMenu(Menu("사이드", "치킨 텐더", "(5조각) 겉바속촉의 케이준 치킨텐더", 5900))
        menu.addMenu(Menu("사이드", "버팔로윙", "(4조각) 오븐에 구워 기름기를 쪼옥 뺀 맛있는 핫윙", 3900))

        menu.addMenu(Menu("음료", "코카콜라", "(500mL)", 1700))
        menu.addMenu(Menu("음료", "코카콜라 제로", "(500mL)", 1700))
        menu.addMenu(Menu("음료", "스프라이트", "(500mL)", 1700))
        menu.addMenu(Menu("음료", "스프라이트 제로", "(500mL)", 1700))
    }

}