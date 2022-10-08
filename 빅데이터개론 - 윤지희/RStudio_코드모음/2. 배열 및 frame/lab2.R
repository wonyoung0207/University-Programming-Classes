
# RStudio themes change
# menu - Tools - Golbal Options - Appearance

# packages install & library ----
install.packages("tidyverse")
library(tidyverse)

install.packages("data.table")
library(data.table)

search()

# Data type ----
x <- "Hello, R"
y <- 256
z <- 0.56

class(x)
typeof(x)

is.integer(x)
is.numeric(x)
is.character(x)

as.character(y)
typeof(as.character(y))
is.character(as.character(y))

# vector ----
c(1,2,3,4)
class(c(1,2,3,4))

c("M","F","M","M")
class(c("M","F","M","M"))

c(TRUE, FALSE, TRUE, FALSE)
class(c(TRUE, FALSE, TRUE, FALSE))


vec1 <- c(1,2,3,4, c(1,3,4))
vec1

# vector merge
vec2 <- c(55:66)
vec2

c(vec1, vec2)


# indexing
# For R, The starting number for index is 0.
vec1[0]
vec1[1]
vec1[1:5]

# element remove
vec1[-1]
vec1[-6]
vec1 <- vec1[-1]

# elements length
length(vec1)
length(vec2)

# repeat
rep(1,times = 5)
rep(1:5,each=3)

# which
vec3 <- c(vec1, vec2)

which(vec3 > 3)
which(vec3 == 1)
which(vec3 == 0)

# 패키지 설치 및 로드 ----
install.packages("tidyverse")
library(tidyverse)

install.packages("data.table")
library(data.table)

search()

# 데이터프레임 ----

# 특성

## 원소는 벡터
## 벡터는 데이터프레임의 열(Column)에 해당한다.
## 벡터는 동일한 길이로 이루어져야 한다. 
##  --> 즉 모든 열은 동일한 높이(또는 길이)로 이루어져야 한다.


# 데이터 프레임 생성
gender <- c("M", "F", "F", "M", "M", "M")
ages <- c(20, 21, 20, 23, 23, 25)

df <- data.frame(gender, ages)
df

View(df)
str(df)

# 1. 리스트 방식 접근
# 리스트 연산자를 사용해 데이터프레임에서 열을 추출하는 방법
# 데이터 프레임은 리스트이므로 구성요소의 이름 또는 인덱스를 통해 접근할 수 있다.
# df[i]. df[[i]], df$name 와 같은 방식으로 사용

# 2. 행렬 방식 접근
# 행렬과 비슷한 표기법을 사용하는 방법
# 데이터 프레임은 행렬과 같은 성격을 갖고 있기 때문에 행렬처럼 접근 할 수 있다.
# df[i, j], df[i, ], df[, j] 처럼 사용

# 리스트 방식 접근
df[2] # 2 열 추출(데이터프레임으로)
df[[2]] # 2열 추출 (벡터로)
df$ages

class(df[2])
class(df[[2]])
class(df$ages)

# 행렬 방식 접근
df[1:3, ]  # df의 1-3행 추출

# 데이터 프레임 인덱싱 (이어서)
df[1:3, ]  # df의 1~3행 추출
df[1:3, 2]  # df의 1~3행, 2열 추출
df[1:3, 2, drop=F]  # 차원축소 방지
df[1:3, 2, drop=T] 

class(df[1:3, 2])
class(df[1:3, 2, drop=F])

# 결측치(NA)란
# 변수는 데이터를 담는 상자에 비유할 수 있다.
# 다음의 두 경우를 생각해보자.

# 1.상자에 데이터가 담겨 있는데 상자가 포장되어 있어서 안에 뭐가 들었는지 모르는 경우
# 2.상자는 있는데 아무 것도 안들어 있는 빈 상자의 경우

# 우리는 1번을 NA, 2번을 NULL이라고 부른다.
# NA는 존재하지만 불확실한 값이고 NULL은 존재하지 않으며 비어있는 값

# 결측치(NA) 제거하기
# 경우에 따라 NA가 있는 관측치는 제거해야 할 필요가 존재함  - NA가 포함된 행 전체

# 결측치를 제거하는 방법에는 두 가지가 있습니다.

# (1) na.omit( )를 사용하는 방법 - NA가 있는 행을 제외하는 함수

# (2) complete.cases( )를 사용하는 방법 -NA가 없는 행을 TURE로 반환

df <- data.frame(x=c(1,2,3,NA,7,8), y=c(5,4,2,2,NA,9))
df

# 첫 번째 방법
clean <- na.omit(df)
clean

# 두 번째 방법
clean2 <- df[complete.cases(df), ]
clean2

# subset
View(iris)
str(iris)
subset(iris, iris$Petal.Length >= 3)
subset(iris, iris$Sepal.Width <= 3)
subset(iris, iris$Sepal.Length == 4.9)
subset(iris, iris$Species == "setosa")
subset(iris, iris$Species != "setosa")


# 데이터프레임의 길이가 다르다면,,,? ----
col1 <- c(1,2,3,4)
col2 <- c("M", "F", "M", "M", "HEHE")
col3 <- c(TRUE, FALSE, TRUE, FALSE)

DF2 <- data.frame(a = col1, b = col2, c = col3)

# 리스트 ----
list_value <- list(iris, cars, airquality)
str(list_value)

str(list_value[1]) # 괄호가 1개인 경우 list로 반환
str(list_value[2])

str(list_value[[1]])
str(list_value[[2]])

# 리스트에 요소 추가 
list_value[[4]] <- "HI"
str(list_value)

# 리스트에 요소 제거 
list_value[[4]] <- NULL
str(list_value)

list_value[[3]] <- NULL
str(list_value)

# lapply
str(list_value[[1]])
lapply(list_value[[1]], mean)
lapply(list_value[[2]], mean)


# udf 이용
lapply(list_value[[1]], function(x){
  a <- x[1]
  b <- x[length(x)]
  return(c(a,b))
})





lapply(cars, FUN = function(x){
  m <- max(x)
  n <- min(x)
  c <- m - n
  return(c(m, n, c))
})

