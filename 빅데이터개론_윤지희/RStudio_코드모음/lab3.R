# read/write ----
## 파일 읽고 쓰기
## 프로젝트를 진행할 경우, 직접 파일을 만드는 경우는 드뭄. 이미 존재하는 파일을 읽고 결과를 출력.

## ftp://210.115.229.94
## 위의 주소로 접속하여 Pre_Seasn_Batter.csv 다운
## 현재 working directory에 옮길 것!!

## base의 read.table, read.csv
  # file : 읽어올 csv 파일
  # header : 기본값은 TRUE로 첫 줄을 변수명으로 읽을 것인지 결정
  # sep : 기본값은 콤마(,)로 열을 구분하는 기호를 전달
  # quote : 기본값은 큰따옴표(")로 각 열을 감싸는 문자 지정. 
  # fill : 기본값은 TRUE로 행 별로 열의 길이가 다를 때는 FALSE를 사용

help("read.table")
?read.table

base_read <- read.table(file = "Pre_Season_Batter.csv")
base_read <- read.table(file = "Pre_Season_Batter.csv", sep = ",")
base_read <- read.table(file = "Pre_Season_Batter.csv", sep = ",", header = TRUE)

base_read <- read.csv(file = "Pre_Season_Batter.csv", header = TRUE)


View(base_read)
str(base_read)
class(base_read)

## readr의 read_delim, read_csv
## tidyverse의 소속 패키지
library(tidyverse)

help("read_delim")

readr_read <- read_delim(file = "Pre_Season_Batter.csv")
readr_read <- read_delim(file = "Pre_Season_Batter.csv", delim = ",")
readr_read <- read_delim(file = "Pre_Season_Batter.csv", delim = ",", col_names = FALSE)

View(readr_read)
class(readr_read)

## data.table의 fread
library(data.table)
help("fread")

fread_read <- fread(file = "Pre_Season_Batter.csv")

View(fread_read)
class(fread_read)

base_read
readr_read
fread_read

## base의 write(quote = T or F)
write.table(x = base_read, file = "base_read.txt", sep = "\t", quote = FALSE)

## readr의 write
write_delim(x = base_read, path = "readr_read.txt", col_names = T)

## data.table의 write
fwrite(x = base_read, file = "fread_read.txt", sep = "\t")


## ftp server의 데이터 read
read.csv(file = "ftp://210.115.229.94/2020_datascience/6th_data/Pre_Season_Batter.csv")
read_csv(file = "ftp://210.115.229.94/2020_datascience/6th_data/Pre_Season_Batter.csv")


# https://csgillespie.github.io/efficientR/5-3-importing-data.html

# 조건문(if, if-else, ifelse) ----

# if , if-else 
# sample 1
grade <- 75
if(grade >= 70){
  print("합격")
} else {
  print("불합격")
}

# sample 2
vec1 <- c(10, 20, 30)
if(vec1 == 10){
  print("인사부")
} else{
  print("총무부")
}  ### -----> warning 발생

# if - else if - else
# sample 3
grade <- 78
if(grade >= 90){
  print("인사부")
} else if(grade >= 70){
  print("개발부")
} else {
  print("혁신부")
}

# warning!
vec1 <- c(10, 20, 30)
for(value in vec1){
  if(value == 20){
    print("사과")
  } else if(value == 10){
    print("배")
  } else{
    print("흠..")
  }
}

# ifelse
vec1 <- c(10,20,30)
vec1_v2 <- ifelse(vec1 == 10, "인사부", "총무부")
vec1_v2
class(vec1_v2)

## 중복 사용 가능
vec1_v3 <- ifelse(vec1 == 10, "인사부", 
                  ifelse(vec1 == 20, "재무부", "총무부"))
vec1_v3

# lapply or sapply
lapply(X = vec1, FUN = function(value){
  return_value <- NULL
  if(value == 10){
    return_value <- "인사부"
  } else{
    return_value <- "총무부"
  }
}) %>% unlist()

## ifelse를 데이터 프레임에 적용!!
new <- ifelse(cars$speed >= 20, "겁나 빠름",
              ifelse(cars$speed >= 10, "쬐금 빠름", "평범.."))
head(new, 10)

cars$new <- new
View(cars)

## dplyr::mutate 이용(!)
cars %>% dplyr::mutate(., new2=ifelse(dist >= 45, "멀다", "가깝나..(?)"))


# 반복문 ----
## for
# 인지가 벡터라면 ----> 각 인덱스에 해당하는 값이 value로 넘거짐
for(value in 1:10){
  print(value)
}

# 인자가 데이터 프레임이라면 ----> 각 열이 벡터로 변환되어 value로 넘겨짐
DF <- read_csv(file = "ftp://210.115.229.94/2020_datascience/6th_data/Pre_Season_Batter.csv")
for(value in DF){
  print(head(value))
}

# 인자가 리스트라면 ----> 각 요소가 value로 넘겨짐
DF2 <- read_csv(file = "ftp://210.115.229.94/2020_datascience/6th_data/Regular_Season_Batter_Day_by_Day_b4.csv")
DF_list <- list(DF, DF2)

for(value in DF_list){
  print(value)
}

index <- 1
while(index <= 10){
  print(index)
  index <- index + 1
}

## 무한루프,..!
index <- 1
while(TRUE){
  print(index)
  index <- index + 1
}

# 함수 ----

# 벡터의 합을 구하기 위한 예제(함수를 쓰지 않았을 떄)
a <- 1:10
b <- 10:50

a_sum <- 0
b_sum <- 0

for(value in a){
  a_sum <- a_sum + value
  print(a_sum)
}
print(a_sum)

for(value in b){
  b_sum <- b_sum + value
  print(b_sum)
}
print(b_sum)

# 벡터의 합을 구하기 위한 예제(함수를 사용했을 때)
vec_sum <- function(x){
  return_sum <- 0
  for(value in x){
    return_sum <- return_sum + value
    print(return_sum)
  }
  return(return_sum)
}

a_sum2 <- vec_sum(a)
b_sum2 <- vec_sum(b)

print(a_sum2)
print(b_sum2)

# 가변인자 ...
f <- function(...) {
  args <- list(...)
  for (a in args) {
    print(a)
  }
}

print(f('3', '4'))

g <- function(z, ...) {
  print(z)
  f(...)
}

print(g(1, 2, 3))
