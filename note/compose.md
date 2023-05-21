# Jetpack Compose

## 기존 XML 방식과 Compose 차이
- XML : 명령형
- Compose : 선언형

## Component

### Surface
### Scaffold
### Modifier
- 컴포넌트 변형자 (모든 컴포넌트에 작성 가능하고, 각 컴포넌트 마다 다른 것으로 보임)

### Column, Low
- Vertical, Horizontal

### LazyColumn, LazyRow
- 스크롤 가능한 Column, Low

### Box
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