# Jetpack Compose

## 기존 XML 방식과 Compose 차이
- XML : 명령형
- Compose : 선언형

코틀린으로 작성되어 기본적으로 구현되어 있는 코드방식을 참고, 활용해서 커스텀하는 것이 좋다.

+ Ctrl + H 단축키로 계층 구조 확인 가능.

Activity 선언 방식이 달라진다. AppCompatActivity -> ComponentActivity.

@Composable Annotation을 통해 Compose 사용을 선언
Compose 함수는 @Composable 안에서 사용 가능 
ex) setContent
public fun ComponentActivity.setContent(
parent: CompositionContext? = null,
content: @Composable () -> Unit
)

Navigation Component(SingleActivity + MultiFragment) 사용을 권장하고,
Compose 는 Fragment 를 사용하지 않음.

Scope Safety - 사용가능한 Scope만 작성할 수 있도록 안전성 제공.

### MaterialTheme
- 컴포즈는 Material Design 디자인시스템 구현을 제공한다.
- 이 MaterialTheme 을 통해 Material Component 들을 제공한다.

### Contents Slot
- 하위 컴포넌트(Composable content)를 구성할 수 있도록 람다 형태로 제공.
- content: @Composable () -> Unit

### Scaffold
- TopBar, BottomBar 등 여러 슬롯과 다양한 구성요소를 통해 편리한 레이아웃을 구성할 수 있도록한다.

### 컴포넌트 명명
- 파스칼케이스(카멜케이스+첫글자대문자)
- =클래스네이밍 컨벤션
- Preview는 뒤에 Preview를 붙인다.

### Preview
- 미리보기 뷰. 여러 개 동시 띄울 수 있음. 
- 각 컴포넌트를 별도로 실행 가능
- Interaction Preview 로 클릭 이벤트, 애니메이션 확인 가능
- showBackground : 배경 표시
- showSystemUi : 디바이스 형태 표시

### Modifier
- 컴포넌트 변형자 (모든 컴포넌트에 작성 가능하고, 각 컴포넌트 마다 다른 것으로 보임)
- setMaxSize, setMaxHeight, setMaxWidth..(matchParent 같은 크기를 지정해줌)
- 호출 순서대로 적용되기 때문에 작성하는 순서를 생각할 필요 있음.

### Scope Safety
- 특정 Composable 에서만 사용할 수 있는 Modifier 유형이 있다.
- 동작하지 않는 Modifier 를 작성하지 못하도록 해준다.


### Surface
- 컨테이너 역할
- 색, 테두리, 그림자 등 지정


### Column, Low
- Vertical, Horizontal
- Arrangement, Alignment


### LazyColumn, LazyRow
- 스크롤 가능한 Column, Low

### Box
- 여러 컴포넌트를 순서대로 쌓아서 배치
- (FrameLayout 과 같은?)

### Text
- 안드로이드 기본 폰트 : roboto

### createRef
- Constraint Layout 지원
- 
### Intrinsics
- 자식 뷰 미리 접근


## State
- Stateful Composable(상태 o) : 상태가 변하면 본인과 자식의 Composable 재구성
- Stateless Composable(상태 x) : 스스로 재구성 못하고, 부모로부터만 재구성

- Compose 는 데이터 관찰을 통해 자동으로 재호출 하고 UI를 그릴 수(==재구성) 있다.
- Composable 는 재구성이 되면 함수가 새로 호출되고 로컬의 상태 값은 유지 되지 않는다.
- remember : 상태 값을 유지 하기 위해 'remember' delegate 사용
- MutableState