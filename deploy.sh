ARCHIVE=100fishes.tar.gz

jekyll --no-auto --no-server
tar -cvzf /tmp/$ARCHIVE _site/
scp /tmp/$ARCHIVE matthew@$1:/tmp/$ARCHIVE
ssh matthew@$1 'tar xvf /tmp/100fishes.tar.gz; mv /tmp/_site ~/www/100fishes'
rm /tmp/$ARCHIVE

