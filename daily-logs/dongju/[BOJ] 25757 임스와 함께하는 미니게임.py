"""
# 임스와 함께하는 미니게임 25757
# Author: DONGJU SEO
# Date: 2025-05-14
# commit : [BOJ] 25757 임스와 함께하는 미니게임 - dongju
"""

# 변수 초기화
names = set() # 이름 저장소
N = 0 # 플레이할 게임 횟수
required_players = {'Y': 1, 'F': 2, 'O': 3} # 게임 종류

while(True):
    n, game = input().split()
    n=int(n)
    # print(n) # (선택)
    while(True):
        name = input("")
        names.add(name)
        # print(n) # (선택)
        n-=1 # 플레이할 게임 횟수에 따른 이름 저장 횟수 제한
        if(n==0):
            # print(names) # (선택)
            break
    break
max_games = len(names) // required_players[game]
print(max_games)