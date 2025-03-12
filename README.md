# 도서관 사물함 예약 서비스

## ERD 설계
![Image](https://github.com/user-attachments/assets/74863749-954d-4117-a56e-bd5da10fb52d)

## API 명세
### 사용자 API
|메서드|엔드포인트|설명|
|------|---|---|
|POST|`/users`|회원가입|
|POST|`/users/login`|로그인|
|GET|`/users/{user_id}`|유저 정보 조회|
|PUT|`/users/{user_id}`|유저 정보 수정|
|DELETE|`/users/{user_id}`|유저 정보 삭제|
|GET|`/lockers`|사물함 목록 조회|
|GET|`/reservations`|예약 목록 조회|
|GET|`/reservations/{reservation_id}`|예약 상세 조회|
|POST|`/reservations`|예약 생성 (유저 -> 사물함 신청)|
|PUT|`/reservations/{reservation_id}`|예약 연장|
|DELETE|`/reservations/{reservation_id}`|예약 취소|
