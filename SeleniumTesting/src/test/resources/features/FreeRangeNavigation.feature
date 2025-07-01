Feature: Navigation bar

    To see the subpages
    Without loggin in
    I can click the navigation bar links

Scenario: I can access the subpages through the navigation bar
  Given I navigate to www.freerangetesters.com
  When I try to access the free sections through the nevigation bar
  Then I am redirected tot he right page
