


<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>itc205/StudentUnitRecordManager.java at shehani · atfernando/itc205</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="atfernando/itc205" name="twitter:title" /><meta content="Contribute to itc205 development by creating an account on GitHub." name="twitter:description" /><meta content="https://avatars3.githubusercontent.com/u/13582810?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars3.githubusercontent.com/u/13582810?v=3&amp;s=400" property="og:image" /><meta content="atfernando/itc205" property="og:title" /><meta content="https://github.com/atfernando/itc205" property="og:url" /><meta content="Contribute to itc205 development by creating an account on GitHub." property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/MTM1ODI4MTY6NmRkNmU0NmIzNGE5YmExNmNiYmIzZWIzMGJjZTQ5MWI6YzkwOGU4YjlhNGZlNGRlMTE5MGE3NjcwOTg2MDhkYmQ3NDRhOGQ1MmQzZWUyNjcyYjg5NGFjYjllOWJlMWNiOA==--e8fc92f1441f164ccc8c9ed7a1a5c98353593e29">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

        <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="77E133E3:4B3B:432EC35:55DFF29D" name="octolytics-dimension-request_id" /><meta content="13582816" name="octolytics-actor-id" /><meta content="skling02" name="octolytics-actor-login" /><meta content="879cf0f15405d0a277749d364821a3b9c154ca732223bee749c494a949834316" name="octolytics-actor-hash" />
    
    <meta content="Rails, view, blob#show" data-pjax-transient="true" name="analytics-event" />
    <meta class="js-ga-set" name="dimension1" content="Logged In">
      <meta class="js-ga-set" name="dimension4" content="Current repo nav">
    <meta name="is-dotcom" content="true">
        <meta name="hostname" content="github.com">
    <meta name="user-login" content="skling02">

      <link rel="icon" sizes="any" mask href="https://assets-cdn.github.com/pinned-octocat.svg">
      <meta name="theme-color" content="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <!-- </textarea> --><!-- '"` --><meta content="authenticity_token" name="csrf-param" />
<meta content="GZ0ySQJKG4CCubSfrrbhQ3crlQEzAzYasOwVmmX98uWr4as6P5ZLmfBuR/WZZ3E71hFykX4ZrjvA7kNBeUo08g==" name="csrf-token" />
    <meta content="20229d510fffd6fdce796fa399c802397df956a6" name="form-nonce" />

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github/index-ebd09ebc92d1048dd7af5cd68484181a6a6a0260b3df1e7349053db235e6c53a.css" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github2/index-8f6585fb18612dd4cf67dd0b3aac6f1e0cf5c9b915e8bfa5989c581f53d36e01.css" media="all" rel="stylesheet" />
    
    


    <meta http-equiv="x-pjax-version" content="5b3ac96571a753d47620995a7eeb640f">

      
  <meta name="description" content="Contribute to itc205 development by creating an account on GitHub.">
  <meta name="go-import" content="github.com/atfernando/itc205 git https://github.com/atfernando/itc205.git">

  <meta content="13582810" name="octolytics-dimension-user_id" /><meta content="atfernando" name="octolytics-dimension-user_login" /><meta content="39987935" name="octolytics-dimension-repository_id" /><meta content="atfernando/itc205" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="39987935" name="octolytics-dimension-repository_network_root_id" /><meta content="atfernando/itc205" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/atfernando/itc205/commits/shehani.atom" rel="alternate" title="Recent Commits to itc205:shehani" type="application/atom+xml">

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      



        <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/atfernando/itc205/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/atfernando/itc205/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <label class="js-chromeless-input-container form-control">
    <div class="scope-badge">This repository</div>
    <input type="text"
      class="js-site-search-focus js-site-search-field is-clearable chromeless-input"
      data-hotkey="s"
      name="q"
      placeholder="Search"
      aria-label="Search this repository"
      data-global-scope-placeholder="Search GitHub"
      data-repo-scope-placeholder="Search"
      tabindex="1"
      autocapitalize="off">
  </label>
</form>
      </div>

      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item">
      <span class="js-socket-channel js-updatable-content"
        data-channel="notification-changed:skling02"
        data-url="/notifications/header">
      <a href="/atfernando/itc205/notifications" aria-label="You have unread notifications in this repository" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:unread" data-hotkey="g n">
          <span class="mail-status unread"></span>
          <span class="octicon octicon-bell"></span>
</a>  </span>

  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus left"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="atfernando/itc205">This repository</span>
  </div>
    <a class="dropdown-item" href="/atfernando/itc205/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>

      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-s js-menu-target" href="/skling02"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@skling02" class="avatar" height="20" src="https://avatars0.githubusercontent.com/u/13582816?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu dropdown-menu-sw">
        <div class="dropdown-header header-nav-current-user css-truncate">
          Signed in as <strong class="css-truncate-target">skling02</strong>
        </div>
        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/skling02" data-ga-click="Header, go to profile, text:your profile">
          Your profile
        </a>
        <a class="dropdown-item" href="/stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>
        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
          Settings
        </a>

        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/logout" class="logout-form" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="yCCXYFiTjQPoeUJ99tm6TyZDCcZhWsH846uzL4+SaBP6O2/bteoucL72KiGFqMD1V954FiFGoaMf34p+iJREPA==" /></div>
          <button class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
</form>      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>

        

        
<div class="flash-global js-notice flash-warn">
<div class="container">
      <h2>
        You don’t have any verified emails.  We recommend <a href="https://github.com/settings/emails">verifying</a> at least one email.
      </h2>
      <p>
        Email verification helps our support team verify ownership if you lose account access
        and allows you to receive all the notifications you ask for.
      </p>

















</div>
</div>


      <div id="start-of-content" class="accessibility-aid"></div>

      <div id="js-flash-container">
</div>


          <div itemscope itemtype="http://schema.org/WebPage">
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">

        <div class="clearfix">
          
<ul class="pagehead-actions">

  <li>
      <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="a0qwZkpQc+UuxFfGT6S9mDXzC4BwIWhw04TPQ9unQs1igRFb59EkFaPUuYtEYEhFdh38qs+1oXG+Obcan5Q5og==" /></div>    <input id="repository_id" name="repository_id" type="hidden" value="39987935" />

      <div class="select-menu js-menu-container js-select-menu">
        <a href="/atfernando/itc205/subscription"
          class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
          data-ga-click="Repository, click Watch settings, action:blob#show">
          <span class="js-select-button">
            <span class="octicon octicon-eye"></span>
            Unwatch
          </span>
        </a>
        <a class="social-count js-social-count" href="/atfernando/itc205/watchers">
          5
        </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span class="select-menu-title">Notifications</span>
              <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
            </div>

            <div class="select-menu-list js-navigation-container" role="menu">

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_included" name="do" type="radio" value="included" />
                  <span class="select-menu-item-heading">Not watching</span>
                  <span class="description">Be notified when participating or @mentioned.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Watch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                  <span class="select-menu-item-heading">Watching</span>
                  <span class="description">Be notified of all conversations.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Unwatch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_ignore" name="do" type="radio" value="ignore" />
                  <span class="select-menu-item-heading">Ignoring</span>
                  <span class="description">Never be notified.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-mute"></span>
                    Stop ignoring
                  </span>
                </div>
              </div>

            </div>

          </div>
        </div>
      </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/atfernando/itc205/unstar" class="js-toggler-form starred js-unstar-button" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="KA4c+pZ7U9SapE87iQ23mPZuuVOAqtUl77TDieMFRCzLqK51Ro2OGtpAl8UaQI5yyvSpyPUfe+x1YhMYc8bZHQ==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar atfernando/itc205"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/atfernando/itc205/stargazers">
          0
        </a>
</form>
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/atfernando/itc205/star" class="js-toggler-form unstarred js-star-button" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="zcjckoQahJVA4ZQX+/OGdIwhrtZiJTgUvbgbLYa9RJ1D2POb1eTPDlQV9FBkSCfaE0deFU/uBRSNWz7liAyw2w==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star atfernando/itc205"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/atfernando/itc205/stargazers">
          0
        </a>
</form>  </div>

  </li>

        <li>
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/atfernando/itc205/fork" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="th/aDsFW4i6NIxLj+GF7sFh8Mhft6GKhQGBp+0qOHth9iM0Oyk50DOH/tXVKTbgBj0kI6AC7o+qwihzq/ALthA==" /></div>
            <button
                type="submit"
                class="btn btn-sm btn-with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of atfernando/itc205 to your account"
                aria-label="Fork your own copy of atfernando/itc205 to your account">
              <span class="octicon octicon-repo-forked"></span>
              Fork
            </button>
            <a href="/atfernando/itc205/network" class="social-count">3</a>
</form>        </li>

</ul>

          <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public ">
  <span class="mega-octicon octicon-repo"></span>
  <span class="author"><a href="/atfernando" class="url fn" itemprop="url" rel="author"><span itemprop="title">atfernando</span></a></span><!--
--><span class="path-divider">/</span><!--
--><strong><a href="/atfernando/itc205" data-pjax="#js-repo-pjax-container">itc205</a></strong>

  <span class="page-context-loader">
    <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
  </span>

</h1>

        </div>
      </div>
    </div>

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline ">
        <div class="repository-sidebar clearfix">
          
<nav class="sunken-menu repo-nav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/atfernando/itc205/issues/counts">
  <ul class="sunken-menu-group">
    <li class="tooltipped tooltipped-w" aria-label="Code">
      <a href="/atfernando/itc205/tree/shehani" aria-label="Code" aria-selected="true" class="js-selected-navigation-item selected sunken-menu-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /atfernando/itc205/tree/shehani">
        <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Issues">
        <a href="/atfernando/itc205/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /atfernando/itc205/issues">
          <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
          <span class="js-issue-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

    <li class="tooltipped tooltipped-w" aria-label="Pull requests">
      <a href="/atfernando/itc205/pulls" aria-label="Pull requests" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g p" data-selected-links="repo_pulls /atfernando/itc205/pulls">
          <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull requests</span>
          <span class="js-pull-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Wiki">
        <a href="/atfernando/itc205/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g w" data-selected-links="repo_wiki /atfernando/itc205/wiki">
          <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
  </ul>
  <div class="sunken-menu-separator"></div>
  <ul class="sunken-menu-group">

    <li class="tooltipped tooltipped-w" aria-label="Pulse">
      <a href="/atfernando/itc205/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-selected-links="pulse /atfernando/itc205/pulse">
        <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

    <li class="tooltipped tooltipped-w" aria-label="Graphs">
      <a href="/atfernando/itc205/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_graphs repo_contributors /atfernando/itc205/graphs">
        <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>
  </ul>


</nav>

            <div class="only-with-full-nav">
                
<div class="js-clone-url clone-url open"
  data-protocol-type="http">
  <h3><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/atfernando/itc205.git" readonly="readonly" aria-label="HTTPS clone URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="js-clone-url clone-url "
  data-protocol-type="ssh">
  <h3><span class="text-emphasized">SSH</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="git@github.com:atfernando/itc205.git" readonly="readonly" aria-label="SSH clone URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="js-clone-url clone-url "
  data-protocol-type="subversion">
  <h3><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/atfernando/itc205" readonly="readonly" aria-label="Subversion checkout URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>



  <div class="clone-options">You can clone with
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=http&amp;protocol_type=push" class="inline-form js-clone-selector-form is-enabled" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="7hb8dxnwYk/DRDBlOMIOMA+FU2mc0ZTBjtxSCsX1D/N889lVQitiaPmWZDw1gJaIa1jfhUKIl1WUHyyRS9orzw==" /></div><button class="btn-link js-clone-selector" data-protocol="http" type="submit">HTTPS</button></form>, <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=push" class="inline-form js-clone-selector-form is-enabled" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="VVT2qZ4UfZ7JAX/OL8PVIjFa3sibqrAnpXAZboKUlY/W4A8LalCH2BPqMzmjY0ZXUL1R2JYHUs24J5J0WvdXNg==" /></div><button class="btn-link js-clone-selector" data-protocol="ssh" type="submit">SSH</button></form>, or <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=push" class="inline-form js-clone-selector-form is-enabled" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="dfCROdia7f25vHwKHDkWV/Y8LWBbapuFQkWa1LGd5zJzbFIC2uIoY1HU7qHBrlfa8CVGPTi6m78u82VQNb/mjQ==" /></div><button class="btn-link js-clone-selector" data-protocol="subversion" type="submit">Subversion</button></form>.
    <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
      <span class="octicon octicon-question"></span>
    </a>
  </div>
    <a href="github-windows://openRepo/https://github.com/atfernando/itc205" class="btn btn-sm sidebar-button" title="Save atfernando/itc205 to your computer and use it in GitHub Desktop." aria-label="Save atfernando/itc205 to your computer and use it in GitHub Desktop.">
      <span class="octicon octicon-desktop-download"></span>
      Clone in Desktop
    </a>

              <a href="/atfernando/itc205/archive/shehani.zip"
                 class="btn btn-sm sidebar-button"
                 aria-label="Download the contents of atfernando/itc205 as a zip file"
                 title="Download the contents of atfernando/itc205 as a zip file"
                 rel="nofollow">
                <span class="octicon octicon-cloud-download"></span>
                Download ZIP
              </a>
            </div>
        </div>
        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>

          

<a href="/atfernando/itc205/blob/218d1dcc778441f0fd3587ea749ffa21b281ba00/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:bd85260e862c6a9566e7d6cc9d1da532 -->

  <div class="file-navigation js-zeroclipboard-container">
    
<div class="select-menu js-menu-container js-select-menu left">
  <span class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-ref="shehani"
    title="shehani"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Branch:</i>
    <span class="js-select-button css-truncate-target">shehani</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Find or create a branch…" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/atfernando/itc205/blob/akila/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java"
               data-name="akila"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="akila">
                akila
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/atfernando/itc205/blob/anton/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java"
               data-name="anton"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="anton">
                anton
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/atfernando/itc205/blob/master/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="master">
                master
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/atfernando/itc205/blob/sajeevan/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java"
               data-name="sajeevan"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="sajeevan">
                sajeevan
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/atfernando/itc205/blob/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java"
               data-name="shehani"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="shehani">
                shehani
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/atfernando/itc205/blob/shehani2/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java"
               data-name="shehani2"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="shehani2">
                shehani2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/atfernando/itc205/blob/sujeevan/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java"
               data-name="sujeevan"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="sujeevan">
                sujeevan
              </span>
            </a>
        </div>

          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/atfernando/itc205/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="/SXHrES+QUZDSsJw9MyZ7e1f1IfH57Gzo7I3m4LLeFbdSetfduRaCMY3XfnfPQgqGUOJWx7TyXaJ1JkK/9gu5Q==" /></div>
            <span class="octicon octicon-git-branch select-menu-item-icon"></span>
            <div class="select-menu-item-text">
              <span class="select-menu-item-heading">Create branch: <span class="js-new-item-name"></span></span>
              <span class="description">from ‘shehani’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="shehani">
            <input type="hidden" name="path" id="path" value="ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java">
</form>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

    <div class="btn-group right">
      <a href="/atfernando/itc205/find/shehani"
            class="js-show-file-finder btn btn-sm empty-icon tooltipped tooltipped-nw"
            data-pjax
            data-hotkey="t"
            aria-label="Quickly jump between files">
        <span class="octicon octicon-list-unordered"></span>
      </a>
      <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </div>

    <div class="breadcrumb js-zeroclipboard-target">
      <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/atfernando/itc205/tree/shehani" class="" data-branch="shehani" data-pjax="true" itemscope="url"><span itemprop="title">itc205</span></a></span></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/atfernando/itc205/tree/shehani/ITC515_assignment2" class="" data-branch="shehani" data-pjax="true" itemscope="url"><span itemprop="title">ITC515_assignment2</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/atfernando/itc205/tree/shehani/ITC515_assignment2/src" class="" data-branch="shehani" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/atfernando/itc205/tree/shehani/ITC515_assignment2/src/datamanagement" class="" data-branch="shehani" data-pjax="true" itemscope="url"><span itemprop="title">datamanagement</span></a></span><span class="separator">/</span><strong class="final-path">StudentUnitRecordManager.java</strong>
    </div>
  </div>


  <div class="commit file-history-tease">
    <div class="file-history-tease-header">
        <img alt="@skling02" class="avatar" height="24" src="https://avatars2.githubusercontent.com/u/13582816?v=3&amp;s=48" width="24" />
        <span class="author"><a href="/skling02" rel="contributor">skling02</a></span>
        <time datetime="2015-08-26T20:22:55Z" is="relative-time">Aug 27, 2015</time>
        <div class="commit-title">
            <a href="/atfernando/itc205/commit/48427baffb95033cdcf1055b015c36ef6452d9ab" class="message" data-pjax="true" title="Update StudentUnitRecordManager.java">Update StudentUnitRecordManager.java</a>
        </div>
    </div>

    <div class="participation">
      <p class="quickstat">
        <a href="#blob_contributors_box" rel="facebox">
          <strong>2</strong>
           contributors
        </a>
      </p>
          <a class="avatar-link tooltipped tooltipped-s" aria-label="skling02" href="/atfernando/itc205/commits/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java?author=skling02"><img alt="@skling02" class="avatar" height="20" src="https://avatars0.githubusercontent.com/u/13582816?v=3&amp;s=40" width="20" /> </a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="atfernando" href="/atfernando/itc205/commits/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java?author=atfernando"><img alt="@atfernando" class="avatar" height="20" src="https://avatars3.githubusercontent.com/u/13582810?v=3&amp;s=40" width="20" /> </a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header" id="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list" id="facebox-description">
          <li class="facebox-user-list-item">
            <img alt="@skling02" height="24" src="https://avatars2.githubusercontent.com/u/13582816?v=3&amp;s=48" width="24" />
            <a href="/skling02">skling02</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="@atfernando" height="24" src="https://avatars1.githubusercontent.com/u/13582810?v=3&amp;s=48" width="24" />
            <a href="/atfernando">atfernando</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
    <div class="file-actions">

      <div class="btn-group">
        <a href="/atfernando/itc205/raw/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java" class="btn btn-sm " id="raw-url">Raw</a>
          <a href="/atfernando/itc205/blame/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
        <a href="/atfernando/itc205/commits/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java" class="btn btn-sm " rel="nofollow">History</a>
      </div>

        <a class="octicon-btn tooltipped tooltipped-nw"
           href="github-windows://openRepo/https://github.com/atfernando/itc205?branch=shehani&amp;filepath=ITC515_assignment2%2Fsrc%2Fdatamanagement%2FStudentUnitRecordManager.java"
           aria-label="Open this file in GitHub Desktop"
           data-ga-click="Repository, open with desktop, type:windows">
            <span class="octicon octicon-device-desktop"></span>
        </a>

            <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/atfernando/itc205/edit/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java" class="inline-form" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="m2GkQACXNSvJ/ASaPnjt5SMwPRSG9bsKc5RJBFvcW5jwazWTyPp4dsecAa9nqs+JlCEndgt8ffueWtvtKyn3eA==" /></div>
              <button class="octicon-btn tooltipped tooltipped-n" type="submit" aria-label="Edit this file" data-hotkey="e" data-disable-with>
                <span class="octicon octicon-pencil"></span>
              </button>
</form>
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/atfernando/itc205/delete/shehani/ITC515_assignment2/src/datamanagement/StudentUnitRecordManager.java" class="inline-form" data-form-nonce="20229d510fffd6fdce796fa399c802397df956a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="KrAyfCMWTrT7NgUXep9QJCawVP3fEg2iSUeSui/TJjrs8fr3s6VPQoj7vpT5IVUQ/BtTteCV0NA3Kp4fV3q0tQ==" /></div>
            <button class="octicon-btn octicon-btn-danger tooltipped tooltipped-n" type="submit" aria-label="Delete this file" data-disable-with>
              <span class="octicon octicon-trashcan"></span>
            </button>
</form>    </div>

    <div class="file-info">
        <span class="file-mode" title="File mode">executable file</span>
        <span class="file-info-divider"></span>
        168 lines (84 sloc)
        <span class="file-info-divider"></span>
      6.351 kB
    </div>
  </div>
  

  <div class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-k">package</span> <span class="pl-smi">datamanagement</span>;</td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.List</span>;</td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">org.jdom.*</span>;</td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">StudentUnitRecordManager</span> {</td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line"><span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">StudentUnitRecordManager</span> instance <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">private</span> <span class="pl-smi">StudentUnitRecordMap</span> studentMap;</td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">private</span> <span class="pl-k">java.util.HashMap&lt;<span class="pl-smi">String</span>,<span class="pl-smi">StudentUnitRecordList</span>&gt;</span> subjectToStudentRecord;</td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">private</span> <span class="pl-k">java.util.HashMap&lt;<span class="pl-smi">Integer</span>,<span class="pl-smi">StudentUnitRecordList</span>&gt;</span> studentToSubjectRecord;</td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line">   </td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Check if singleton class exists, return self.</span></td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-smi">StudentUnitRecordManager</span> <span class="pl-en">instance</span>() {</td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line">       </td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span> (instance <span class="pl-k">==</span> <span class="pl-c1">null</span> ) instance <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StudentUnitRecordManager</span>();</td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">return</span> instance;</td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">private</span> <span class="pl-en">StudentUnitRecordManager</span>() {</td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line">                studentMap <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StudentUnitRecordMap</span>();</td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line">                subjectToStudentRecord <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-k">java.util.HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line">                studentToSubjectRecord <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-k">java.util.HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Accessor method to return StudentUnitRecord.</span></td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">public</span> <span class="pl-smi">IStudentUnitRecord</span> <span class="pl-en">getStudentUnitRecord</span>( <span class="pl-smi">Integer</span> <span class="pl-v">studentID</span>, <span class="pl-smi">String</span> <span class="pl-v">unitCode</span> ) {</td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">IStudentUnitRecord</span> ir <span class="pl-k">=</span> studentMap<span class="pl-k">.</span>get(studentID<span class="pl-k">.</span>toString()<span class="pl-k">+</span>unitCode);</td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line"> </td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">return</span> ir <span class="pl-k">!=</span> <span class="pl-c1">null</span> <span class="pl-k">?</span> ir <span class="pl-k">:</span> createStudentUnitRecord(studentID, unitCode);</td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Mutator method to change assessment marks.</span></td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">private</span> <span class="pl-smi">IStudentUnitRecord</span> <span class="pl-en">createStudentUnitRecord</span>( <span class="pl-smi">Integer</span> <span class="pl-v">subjectCode</span>, <span class="pl-smi">String</span> <span class="pl-v">studentId</span> ) {</td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">IStudentUnitRecord</span> newStudentPerUnit;</td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span> (<span class="pl-smi">Element</span> el <span class="pl-k">:</span> (<span class="pl-k">List&lt;<span class="pl-smi">Element</span>&gt;</span>) <span class="pl-smi">XMLManager</span><span class="pl-k">.</span>getXML()<span class="pl-k">.</span>getDocument()</td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line">                        .getRootElement()<span class="pl-k">.</span>getChild(<span class="pl-s"><span class="pl-pds">&quot;</span>studentUnitRecordTable<span class="pl-pds">&quot;</span></span>)</td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line">                        .getChildren(<span class="pl-s"><span class="pl-pds">&quot;</span>record<span class="pl-pds">&quot;</span></span>)) {</td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span> (subjectCode<span class="pl-k">.</span>toString()<span class="pl-k">.</span>equals(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>sid<span class="pl-pds">&quot;</span></span>)) <span class="pl-k">&amp;&amp;</span> studentId<span class="pl-k">.</span>equals(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>uid<span class="pl-pds">&quot;</span></span>))) {</td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line">                        newStudentPerUnit <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StudentUnitRecord</span>( <span class="pl-k">new</span> <span class="pl-smi">Integer</span>(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>sid<span class="pl-pds">&quot;</span></span>)),el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>uid<span class="pl-pds">&quot;</span></span>),<span class="pl-k">new</span> <span class="pl-smi">Float</span>(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>asg1<span class="pl-pds">&quot;</span></span>))<span class="pl-c1">.</span></td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line">                                floatValue(),<span class="pl-k">new</span> <span class="pl-smi">Float</span>(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>asg2<span class="pl-pds">&quot;</span></span>))<span class="pl-k">.</span>floatValue(),<span class="pl-k">new</span> <span class="pl-smi">Float</span>(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>exam<span class="pl-pds">&quot;</span></span>))<span class="pl-k">.</span>floatValue() );</td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line">               </td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line">                        </td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code blob-code-inner js-file-line">                        studentMap<span class="pl-k">.</span>put(newStudentPerUnit<span class="pl-k">.</span>getStudentId()<span class="pl-c1">.</span></td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code blob-code-inner js-file-line">                                toString()<span class="pl-k">+</span>newStudentPerUnit<span class="pl-k">.</span>getUnitCode(), newStudentPerUnit);<span class="pl-k">return</span> newStudentPerUnit;</td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">throw</span> <span class="pl-k">new</span> <span class="pl-smi">RuntimeException</span>(</td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code blob-code-inner js-file-line">                        <span class="pl-s"><span class="pl-pds">&quot;</span>DBMD: createStudent : student unit record not in file<span class="pl-pds">&quot;</span></span>);}</td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Accessor to return a record using subject.</span></td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">public</span> <span class="pl-smi">StudentUnitRecordList</span> <span class="pl-en">getRecordsByUnit</span>( <span class="pl-smi">String</span> <span class="pl-v">subjectCode</span> ) {</td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">StudentUnitRecordList</span> unitRecord <span class="pl-k">=</span> subjectToStudentRecord<span class="pl-k">.</span>get(subjectCode);</td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span> ( unitRecord <span class="pl-k">!=</span> <span class="pl-c1">null</span> ) </td>
      </tr>
      <tr>
        <td id="L73" class="blob-num js-line-number" data-line-number="73"></td>
        <td id="LC73" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">return</span> unitRecord; </td>
      </tr>
      <tr>
        <td id="L74" class="blob-num js-line-number" data-line-number="74"></td>
        <td id="LC74" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L75" class="blob-num js-line-number" data-line-number="75"></td>
        <td id="LC75" class="blob-code blob-code-inner js-file-line">                unitRecord <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StudentUnitRecordList</span>();</td>
      </tr>
      <tr>
        <td id="L76" class="blob-num js-line-number" data-line-number="76"></td>
        <td id="LC76" class="blob-code blob-code-inner js-file-line">       </td>
      </tr>
      <tr>
        <td id="L77" class="blob-num js-line-number" data-line-number="77"></td>
        <td id="LC77" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span> (<span class="pl-smi">Element</span> el <span class="pl-k">:</span> (<span class="pl-k">List&lt;<span class="pl-smi">Element</span>&gt;</span>) <span class="pl-smi">XMLManager</span><span class="pl-k">.</span>getXML()<span class="pl-k">.</span>getDocument()<span class="pl-c1">.</span></td>
      </tr>
      <tr>
        <td id="L78" class="blob-num js-line-number" data-line-number="78"></td>
        <td id="LC78" class="blob-code blob-code-inner js-file-line">                        getRootElement()<span class="pl-k">.</span>getChild(<span class="pl-s"><span class="pl-pds">&quot;</span>studentUnitRecordTable<span class="pl-pds">&quot;</span></span>)<span class="pl-c1">.</span></td>
      </tr>
      <tr>
        <td id="L79" class="blob-num js-line-number" data-line-number="79"></td>
        <td id="LC79" class="blob-code blob-code-inner js-file-line">                        getChildren(<span class="pl-s"><span class="pl-pds">&quot;</span>record<span class="pl-pds">&quot;</span></span>)) {</td>
      </tr>
      <tr>
        <td id="L80" class="blob-num js-line-number" data-line-number="80"></td>
        <td id="LC80" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L81" class="blob-num js-line-number" data-line-number="81"></td>
        <td id="LC81" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span> (subjectCode<span class="pl-k">.</span>equals(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>uid<span class="pl-pds">&quot;</span></span>))) unitRecord.</td>
      </tr>
      <tr>
        <td id="L82" class="blob-num js-line-number" data-line-number="82"></td>
        <td id="LC82" class="blob-code blob-code-inner js-file-line">                            add(<span class="pl-k">new</span> <span class="pl-smi">StudentUnitRecordProxy</span>( <span class="pl-k">new</span> <span class="pl-smi">Integer</span>(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>sid<span class="pl-pds">&quot;</span></span>)), el.</td>
      </tr>
      <tr>
        <td id="L83" class="blob-num js-line-number" data-line-number="83"></td>
        <td id="LC83" class="blob-code blob-code-inner js-file-line">                                    getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>uid<span class="pl-pds">&quot;</span></span>)));</td>
      </tr>
      <tr>
        <td id="L84" class="blob-num js-line-number" data-line-number="84"></td>
        <td id="LC84" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L85" class="blob-num js-line-number" data-line-number="85"></td>
        <td id="LC85" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L86" class="blob-num js-line-number" data-line-number="86"></td>
        <td id="LC86" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L87" class="blob-num js-line-number" data-line-number="87"></td>
        <td id="LC87" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span> ( unitRecord<span class="pl-k">.</span>size() <span class="pl-k">&gt;</span> <span class="pl-c1">0</span> ) </td>
      </tr>
      <tr>
        <td id="L88" class="blob-num js-line-number" data-line-number="88"></td>
        <td id="LC88" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L89" class="blob-num js-line-number" data-line-number="89"></td>
        <td id="LC89" class="blob-code blob-code-inner js-file-line">                    subjectToStudentRecord<span class="pl-k">.</span>put(subjectCode, unitRecord); <span class="pl-c">// be careful - this could be empty</span></td>
      </tr>
      <tr>
        <td id="L90" class="blob-num js-line-number" data-line-number="90"></td>
        <td id="LC90" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L91" class="blob-num js-line-number" data-line-number="91"></td>
        <td id="LC91" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">return</span> unitRecord;</td>
      </tr>
      <tr>
        <td id="L92" class="blob-num js-line-number" data-line-number="92"></td>
        <td id="LC92" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L93" class="blob-num js-line-number" data-line-number="93"></td>
        <td id="LC93" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L94" class="blob-num js-line-number" data-line-number="94"></td>
        <td id="LC94" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L95" class="blob-num js-line-number" data-line-number="95"></td>
        <td id="LC95" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L96" class="blob-num js-line-number" data-line-number="96"></td>
        <td id="LC96" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Accessor to return a record by student.</span></td>
      </tr>
      <tr>
        <td id="L97" class="blob-num js-line-number" data-line-number="97"></td>
        <td id="LC97" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">public</span> <span class="pl-smi">StudentUnitRecordList</span> <span class="pl-en">getRecordsByStudent</span>( <span class="pl-smi">Integer</span> <span class="pl-v">studentID</span> ) {</td>
      </tr>
      <tr>
        <td id="L98" class="blob-num js-line-number" data-line-number="98"></td>
        <td id="LC98" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L99" class="blob-num js-line-number" data-line-number="99"></td>
        <td id="LC99" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">StudentUnitRecordList</span> studentRecord <span class="pl-k">=</span> studentToSubjectRecord<span class="pl-k">.</span>get(studentID);</td>
      </tr>
      <tr>
        <td id="L100" class="blob-num js-line-number" data-line-number="100"></td>
        <td id="LC100" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L101" class="blob-num js-line-number" data-line-number="101"></td>
        <td id="LC101" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span> ( studentRecord <span class="pl-k">!=</span> <span class="pl-c1">null</span> ) <span class="pl-k">return</span> studentRecord; studentRecord <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StudentUnitRecordList</span>();</td>
      </tr>
      <tr>
        <td id="L102" class="blob-num js-line-number" data-line-number="102"></td>
        <td id="LC102" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L103" class="blob-num js-line-number" data-line-number="103"></td>
        <td id="LC103" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span> (<span class="pl-smi">Element</span> el <span class="pl-k">:</span> (<span class="pl-k">List&lt;<span class="pl-smi">Element</span>&gt;</span>) <span class="pl-smi">XMLManager</span><span class="pl-k">.</span>getXML()<span class="pl-k">.</span>getDocument()<span class="pl-c1">.</span></td>
      </tr>
      <tr>
        <td id="L104" class="blob-num js-line-number" data-line-number="104"></td>
        <td id="LC104" class="blob-code blob-code-inner js-file-line">                        getRootElement()<span class="pl-k">.</span>getChild(<span class="pl-s"><span class="pl-pds">&quot;</span>studentUnitRecordTable<span class="pl-pds">&quot;</span></span>)<span class="pl-c1">.</span></td>
      </tr>
      <tr>
        <td id="L105" class="blob-num js-line-number" data-line-number="105"></td>
        <td id="LC105" class="blob-code blob-code-inner js-file-line">                        getChildren(<span class="pl-s"><span class="pl-pds">&quot;</span>record<span class="pl-pds">&quot;</span></span>)) </td>
      </tr>
      <tr>
        <td id="L106" class="blob-num js-line-number" data-line-number="106"></td>
        <td id="LC106" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L107" class="blob-num js-line-number" data-line-number="107"></td>
        <td id="LC107" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span> (studentID<span class="pl-k">.</span>toString()<span class="pl-k">.</span>equals(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>sid<span class="pl-pds">&quot;</span></span>))) </td>
      </tr>
      <tr>
        <td id="L108" class="blob-num js-line-number" data-line-number="108"></td>
        <td id="LC108" class="blob-code blob-code-inner js-file-line">                studentRecord<span class="pl-k">.</span>add(<span class="pl-k">new</span> <span class="pl-smi">StudentUnitRecordProxy</span>( <span class="pl-k">new</span> <span class="pl-smi">Integer</span>(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>sid<span class="pl-pds">&quot;</span></span>)), el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>uid<span class="pl-pds">&quot;</span></span>)));</td>
      </tr>
      <tr>
        <td id="L109" class="blob-num js-line-number" data-line-number="109"></td>
        <td id="LC109" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span> ( studentRecord<span class="pl-k">.</span>size() <span class="pl-k">&gt;</span> <span class="pl-c1">0</span> ) </td>
      </tr>
      <tr>
        <td id="L110" class="blob-num js-line-number" data-line-number="110"></td>
        <td id="LC110" class="blob-code blob-code-inner js-file-line">                    studentToSubjectRecord<span class="pl-k">.</span>put(studentID, studentRecord); <span class="pl-c">// be careful - this could be empty</span></td>
      </tr>
      <tr>
        <td id="L111" class="blob-num js-line-number" data-line-number="111"></td>
        <td id="LC111" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">return</span> studentRecord;</td>
      </tr>
      <tr>
        <td id="L112" class="blob-num js-line-number" data-line-number="112"></td>
        <td id="LC112" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L113" class="blob-num js-line-number" data-line-number="113"></td>
        <td id="LC113" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L114" class="blob-num js-line-number" data-line-number="114"></td>
        <td id="LC114" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L115" class="blob-num js-line-number" data-line-number="115"></td>
        <td id="LC115" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Save changes to the XML database.</span></td>
      </tr>
      <tr>
        <td id="L116" class="blob-num js-line-number" data-line-number="116"></td>
        <td id="LC116" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">saveRecord</span>( <span class="pl-smi">IStudentUnitRecord</span> <span class="pl-v">student</span>) {</td>
      </tr>
      <tr>
        <td id="L117" class="blob-num js-line-number" data-line-number="117"></td>
        <td id="LC117" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> (<span class="pl-smi">Element</span> el <span class="pl-k">:</span> (<span class="pl-k">List&lt;<span class="pl-smi">Element</span>&gt;</span>) <span class="pl-smi">XMLManager</span><span class="pl-k">.</span>getXML()<span class="pl-k">.</span>getDocument()<span class="pl-k">.</span>getRootElement()<span class="pl-c1">.</span></td>
      </tr>
      <tr>
        <td id="L118" class="blob-num js-line-number" data-line-number="118"></td>
        <td id="LC118" class="blob-code blob-code-inner js-file-line">                getChild(<span class="pl-s"><span class="pl-pds">&quot;</span>studentUnitRecordTable<span class="pl-pds">&quot;</span></span>)<span class="pl-k">.</span>getChildren(<span class="pl-s"><span class="pl-pds">&quot;</span>record<span class="pl-pds">&quot;</span></span>)) {</td>
      </tr>
      <tr>
        <td id="L119" class="blob-num js-line-number" data-line-number="119"></td>
        <td id="LC119" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (student<span class="pl-k">.</span>getStudentId()<span class="pl-k">.</span>toString()<span class="pl-k">.</span>equals(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>sid<span class="pl-pds">&quot;</span></span>)) <span class="pl-k">&amp;&amp;</span> student.</td>
      </tr>
      <tr>
        <td id="L120" class="blob-num js-line-number" data-line-number="120"></td>
        <td id="LC120" class="blob-code blob-code-inner js-file-line">                    getUnitCode()<span class="pl-k">.</span>equals(el<span class="pl-k">.</span>getAttributeValue(<span class="pl-s"><span class="pl-pds">&quot;</span>uid<span class="pl-pds">&quot;</span></span>))) {</td>
      </tr>
      <tr>
        <td id="L121" class="blob-num js-line-number" data-line-number="121"></td>
        <td id="LC121" class="blob-code blob-code-inner js-file-line">                el<span class="pl-k">.</span>setAttribute(<span class="pl-s"><span class="pl-pds">&quot;</span>asg1<span class="pl-pds">&quot;</span></span>, <span class="pl-k">new</span> <span class="pl-smi">Float</span>(student<span class="pl-k">.</span>getAssignment1())<span class="pl-k">.</span>toString());</td>
      </tr>
      <tr>
        <td id="L122" class="blob-num js-line-number" data-line-number="122"></td>
        <td id="LC122" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L123" class="blob-num js-line-number" data-line-number="123"></td>
        <td id="LC123" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L124" class="blob-num js-line-number" data-line-number="124"></td>
        <td id="LC124" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L125" class="blob-num js-line-number" data-line-number="125"></td>
        <td id="LC125" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L126" class="blob-num js-line-number" data-line-number="126"></td>
        <td id="LC126" class="blob-code blob-code-inner js-file-line">                el<span class="pl-k">.</span>setAttribute(<span class="pl-s"><span class="pl-pds">&quot;</span>asg2<span class="pl-pds">&quot;</span></span>, <span class="pl-k">new</span> <span class="pl-smi">Float</span>(student<span class="pl-k">.</span>getAssignment2())<span class="pl-k">.</span>toString());</td>
      </tr>
      <tr>
        <td id="L127" class="blob-num js-line-number" data-line-number="127"></td>
        <td id="LC127" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L128" class="blob-num js-line-number" data-line-number="128"></td>
        <td id="LC128" class="blob-code blob-code-inner js-file-line">                el<span class="pl-k">.</span>setAttribute(<span class="pl-s"><span class="pl-pds">&quot;</span>exam<span class="pl-pds">&quot;</span></span>, <span class="pl-k">new</span> <span class="pl-smi">Float</span>(student<span class="pl-k">.</span>getExam())<span class="pl-k">.</span>toString());</td>
      </tr>
      <tr>
        <td id="L129" class="blob-num js-line-number" data-line-number="129"></td>
        <td id="LC129" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L130" class="blob-num js-line-number" data-line-number="130"></td>
        <td id="LC130" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">XMLManager</span><span class="pl-k">.</span>getXML()<span class="pl-k">.</span>saveDocument(); <span class="pl-c">//write out the XML file for continuous save</span></td>
      </tr>
      <tr>
        <td id="L131" class="blob-num js-line-number" data-line-number="131"></td>
        <td id="LC131" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L132" class="blob-num js-line-number" data-line-number="132"></td>
        <td id="LC132" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L133" class="blob-num js-line-number" data-line-number="133"></td>
        <td id="LC133" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L134" class="blob-num js-line-number" data-line-number="134"></td>
        <td id="LC134" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L135" class="blob-num js-line-number" data-line-number="135"></td>
        <td id="LC135" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L136" class="blob-num js-line-number" data-line-number="136"></td>
        <td id="LC136" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L137" class="blob-num js-line-number" data-line-number="137"></td>
        <td id="LC137" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L138" class="blob-num js-line-number" data-line-number="138"></td>
        <td id="LC138" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L139" class="blob-num js-line-number" data-line-number="139"></td>
        <td id="LC139" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L140" class="blob-num js-line-number" data-line-number="140"></td>
        <td id="LC140" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L141" class="blob-num js-line-number" data-line-number="141"></td>
        <td id="LC141" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L142" class="blob-num js-line-number" data-line-number="142"></td>
        <td id="LC142" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L143" class="blob-num js-line-number" data-line-number="143"></td>
        <td id="LC143" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L144" class="blob-num js-line-number" data-line-number="144"></td>
        <td id="LC144" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L145" class="blob-num js-line-number" data-line-number="145"></td>
        <td id="LC145" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L146" class="blob-num js-line-number" data-line-number="146"></td>
        <td id="LC146" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L147" class="blob-num js-line-number" data-line-number="147"></td>
        <td id="LC147" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L148" class="blob-num js-line-number" data-line-number="148"></td>
        <td id="LC148" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L149" class="blob-num js-line-number" data-line-number="149"></td>
        <td id="LC149" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L150" class="blob-num js-line-number" data-line-number="150"></td>
        <td id="LC150" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L151" class="blob-num js-line-number" data-line-number="151"></td>
        <td id="LC151" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L152" class="blob-num js-line-number" data-line-number="152"></td>
        <td id="LC152" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L153" class="blob-num js-line-number" data-line-number="153"></td>
        <td id="LC153" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">throw</span> <span class="pl-k">new</span> <span class="pl-smi">RuntimeException</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>DBMD: saveRecord : no such student record in data<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L154" class="blob-num js-line-number" data-line-number="154"></td>
        <td id="LC154" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L155" class="blob-num js-line-number" data-line-number="155"></td>
        <td id="LC155" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
      <tr>
        <td id="L156" class="blob-num js-line-number" data-line-number="156"></td>
        <td id="LC156" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L157" class="blob-num js-line-number" data-line-number="157"></td>
        <td id="LC157" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L158" class="blob-num js-line-number" data-line-number="158"></td>
        <td id="LC158" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L159" class="blob-num js-line-number" data-line-number="159"></td>
        <td id="LC159" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L160" class="blob-num js-line-number" data-line-number="160"></td>
        <td id="LC160" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L161" class="blob-num js-line-number" data-line-number="161"></td>
        <td id="LC161" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L162" class="blob-num js-line-number" data-line-number="162"></td>
        <td id="LC162" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L163" class="blob-num js-line-number" data-line-number="163"></td>
        <td id="LC163" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L164" class="blob-num js-line-number" data-line-number="164"></td>
        <td id="LC164" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L165" class="blob-num js-line-number" data-line-number="165"></td>
        <td id="LC165" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L166" class="blob-num js-line-number" data-line-number="166"></td>
        <td id="LC166" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L167" class="blob-num js-line-number" data-line-number="167"></td>
        <td id="LC167" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
</table>

  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

        </div>
      </div>
      <div class="modal-backdrop"></div>
    </div>
  </div>


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>
        <li><a href="https://github.com/pricing" data-ga-click="Footer, go to pricing, text:pricing">Pricing</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.08236s from github-fe141-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-suggester-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder="" aria-label=""></textarea>
      <div class="suggester-container">
        <div class="suggester fullscreen-suggester js-suggester js-navigation-container"></div>
      </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x flash-close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-2317046bbda4f1c516c598a8b2c63343669922648e6987a1ed4f909dce1fb689.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github/index-2efaed87d243059271b17f471f397d89250e43b5d13c5db8577c7281f98ebba0.js"></script>
      
      
    <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner hidden">
      <span class="octicon octicon-alert"></span>
      <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
      <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
    </div>
  </body>
</html>

